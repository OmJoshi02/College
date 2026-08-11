import { render, screen } from '@testing-library/react';
import App from './App';

test('renders resume heading', () => {
  render(<App />);
  expect(screen.getByText(/priya sharma/i)).toBeInTheDocument();
});
