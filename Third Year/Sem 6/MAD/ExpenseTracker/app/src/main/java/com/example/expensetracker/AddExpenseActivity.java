package com.example.expensetracker;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.text.SimpleDateFormat;
import java.util.*;

public class AddExpenseActivity extends AppCompatActivity {

    EditText amountInput, dateInput;
    AutoCompleteTextView categoryInput;
    Button saveBtn;

    ChipGroup chipGroup;

    DBHelper dbHelper;

    Calendar calendar;
    String selectedDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        amountInput = findViewById(R.id.amountInput);
        categoryInput = findViewById(R.id.categoryInput);
        dateInput = findViewById(R.id.dateInput);
        saveBtn = findViewById(R.id.saveBtn);
        chipGroup = findViewById(R.id.chipGroupCategories);

        dbHelper = new DBHelper(this);
        calendar = Calendar.getInstance();

        setupDate();
        setupCategories();
        setupSave();
    }

    // ================= DATE =================
    private void setupDate() {
        updateDateField();

        dateInput.setOnClickListener(v -> {
            new DatePickerDialog(
                    this,
                    (view, year, month, day) -> {
                        calendar.set(year, month, day);
                        updateDateField();
                    },
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
            ).show();
        });
    }

    private void updateDateField() {
        SimpleDateFormat dbFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        selectedDateTime = dbFormat.format(calendar.getTime());

        SimpleDateFormat displayFormat =
                new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
        dateInput.setText(displayFormat.format(calendar.getTime()));
    }

    private void showAddCategoryDialog() {

        EditText input = new EditText(this);
        input.setHint("Enter name");

        new android.app.AlertDialog.Builder(this)
                .setTitle("New Category")
                .setView(input)
                .setPositiveButton("Add", (dialog, which) -> {

                    String newCategory = input.getText().toString().trim();

                    if (!newCategory.isEmpty()) {

                        // Save in DB
                        dbHelper.insertCategory(newCategory);

                        // Set selected
                        categoryInput.setText(newCategory);

                        // Refresh chips
                        setupCategories();
                    }
                })
                .setNegativeButton("Cancel", null)
                .show();
    }
    // ================= CATEGORY =================
    private void setupCategories() {

        ArrayList<String> categories = dbHelper.getAllCategories();

        // DROPDOWN
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                categories
        );
        categoryInput.setAdapter(adapter);
        categoryInput.setOnClickListener(v -> categoryInput.showDropDown());

        chipGroup.removeAllViews();

        // NORMAL CHIPS
        for (String name : categories) {

            Chip chip = new Chip(this);
            chip.setText(name);
            chip.setCheckable(true);

            // Click → select
            chip.setOnClickListener(v -> categoryInput.setText(name));

            // LONG PRESS → DELETE
            chip.setOnLongClickListener(v -> {

                new android.app.AlertDialog.Builder(this)
                        .setTitle("Delete Category")
                        .setMessage("Delete \"" + name + "\"?")
                        .setPositiveButton("Yes", (dialog, which) -> {

                            // Delete from DB
                            dbHelper.deleteCategory(name);

                            // Refresh chips
                            setupCategories();

                            // Clear input if deleted one was selected
                            if (categoryInput.getText().toString().equals(name)) {
                                categoryInput.setText("");
                            }

                        })
                        .setNegativeButton("No", null)
                        .show();

                return true;
            });

            chipGroup.addView(chip);
        }

        // ➕ ADD BUTTON CHIP
        Chip addChip = new Chip(this);
        addChip.setText("+");
        addChip.setChipIconResource(android.R.drawable.ic_input_add);
        addChip.setCheckable(false);

        addChip.setOnClickListener(v -> showAddCategoryDialog());

        chipGroup.addView(addChip);
    }

    // ================= SAVE =================
    private void setupSave() {

        saveBtn.setOnClickListener(v -> {

            String amountStr = amountInput.getText().toString().trim();
            String category = categoryInput.getText().toString().trim();

            if (amountStr.isEmpty() || category.isEmpty()) {
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            double amount = Double.parseDouble(amountStr);

            dbHelper.insertExpense(amount, category, selectedDateTime);

            // auto-save new category
            dbHelper.insertCategory(category);

            Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}