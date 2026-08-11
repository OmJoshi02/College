import './App.css';
import AppBar from '@mui/material/AppBar';
import Avatar from '@mui/material/Avatar';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';
import Card from '@mui/material/Card';
import CardContent from '@mui/material/CardContent';
import Chip from '@mui/material/Chip';
import Container from '@mui/material/Container';
import Divider from '@mui/material/Divider';
import Grid from '@mui/material/Grid';
import Link from '@mui/material/Link';
import List from '@mui/material/List';
import ListItem from '@mui/material/ListItem';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import Paper from '@mui/material/Paper';
import Stack from '@mui/material/Stack';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import { ThemeProvider, createTheme } from '@mui/material/styles';
import EmailRoundedIcon from '@mui/icons-material/EmailRounded';
import GitHubIcon from '@mui/icons-material/GitHub';
import LanguageRoundedIcon from '@mui/icons-material/LanguageRounded';
import LinkedInIcon from '@mui/icons-material/LinkedIn';
import LocationOnRoundedIcon from '@mui/icons-material/LocationOnRounded';
import MenuBookRoundedIcon from '@mui/icons-material/MenuBookRounded';
import PhoneRoundedIcon from '@mui/icons-material/PhoneRounded';
import RocketLaunchRoundedIcon from '@mui/icons-material/RocketLaunchRounded';
import SchoolRoundedIcon from '@mui/icons-material/SchoolRounded';
import StarRoundedIcon from '@mui/icons-material/StarRounded';
import WorkHistoryRoundedIcon from '@mui/icons-material/WorkHistoryRounded';

const theme = createTheme({
  palette: {
    primary: {
      main: '#0f766e',
    },
    secondary: {
      main: '#f59e0b',
    },
    background: {
      default: '#f4efe7',
      paper: '#fffdf8',
    },
    text: {
      primary: '#1f2937',
      secondary: '#5b6473',
    },
  },
  typography: {
    fontFamily: '"Poppins", "Segoe UI", sans-serif',
    h2: {
      fontWeight: 700,
    },
    h4: {
      fontWeight: 700,
    },
    h5: {
      fontWeight: 600,
    },
  },
  shape: {
    borderRadius: 20,
  },
});

const skills = [
  'React',
  'Material UI',
  'JavaScript',
  'HTML5',
  'CSS3',
  'Node.js',
  'Express',
  'MongoDB',
  'Git',
  'REST APIs',
];

const experiences = [
  {
    role: 'Frontend Developer Intern',
    company: 'Creative Web Studio',
    period: 'Jan 2026 - Jun 2026',
    points: [
      'Built responsive interfaces with React and component-driven workflows.',
      'Improved dashboard usability by reorganizing data into cards, filters, and clear actions.',
      'Collaborated with designers to turn low-fidelity wireframes into production-ready screens.',
    ],
  },
  {
    role: 'Freelance Web Developer',
    company: 'Self-Directed Projects',
    period: '2024 - Present',
    points: [
      'Designed portfolio, landing page, and student utility websites for local clients.',
      'Customized UI themes and reusable sections for faster delivery across multiple projects.',
      'Handled deployment, bug fixes, and small feature requests after launch.',
    ],
  },
];

const projects = [
  {
    name: 'Resume Builder UI',
    description:
      'A polished personal resume interface using Material UI cards, chips, and responsive layouts.',
  },
  {
    name: 'Student Dashboard',
    description:
      'A compact dashboard for attendance, assignments, and quick updates with mobile-first navigation.',
  },
  {
    name: 'Task Tracker App',
    description:
      'A productivity app with status grouping, progress indicators, and clean component structure.',
  },
];

const education = [
  'B.E. / B.Tech in Computer Engineering',
  'Expected Graduation: 2027',
  'Relevant Coursework: Web Development, DBMS, Software Engineering',
];

function App() {
  return (
    <ThemeProvider theme={theme}>
      <Box className="app-shell">
        <AppBar position="sticky" color="transparent" elevation={0} className="resume-appbar">
          <Toolbar className="resume-toolbar">
            <Typography variant="h6" className="brand-mark">
              My Resume
            </Typography>
            <Stack direction="row" spacing={1.5} alignItems="center">
              <Button color="primary" href="#experience">
                Experience
              </Button>
              <Button color="primary" href="#projects">
                Projects
              </Button>
              <Button variant="contained" color="secondary" href="#contact">
                Contact
              </Button>
            </Stack>
          </Toolbar>
        </AppBar>

        <Container maxWidth="lg" className="resume-page">
          <Paper elevation={0} className="hero-panel">
            <Grid container spacing={4} alignItems="center">
              <Grid size={{ xs: 12, md: 8 }}>
                <Stack spacing={2.5}>
                  <Chip
                    icon={<RocketLaunchRoundedIcon />}
                    label="Open to internships and frontend roles"
                    color="primary"
                    className="status-chip"
                  />
                  <Typography variant="h2">
                    Priya Sharma
                  </Typography>
                  <Typography variant="h5" color="text.secondary">
                    Frontend-focused developer building clean, responsive interfaces with React and Material UI.
                  </Typography>
                  <Typography variant="body1" className="intro-copy">
                    I enjoy turning ideas into modern web experiences that feel approachable, fast, and visually clear.
                    This template is ready for you to replace with your own name, education, projects, and links.
                  </Typography>
                  <Stack direction={{ xs: 'column', sm: 'row' }} spacing={2}>
                    <Button variant="contained" size="large" href="#contact">
                      Hire Me
                    </Button>
                    <Button variant="outlined" size="large" href="#projects">
                      View Projects
                    </Button>
                  </Stack>
                </Stack>
              </Grid>
              <Grid size={{ xs: 12, md: 4 }}>
                <Stack spacing={2} alignItems={{ xs: 'flex-start', md: 'center' }}>
                  <Avatar className="hero-avatar">PS</Avatar>
                  <Paper elevation={0} className="quick-facts-card">
                    <Stack spacing={1.5}>
                      <Typography variant="subtitle1" fontWeight={600}>
                        Highlights
                      </Typography>
                      <Stack direction="row" spacing={1} alignItems="center">
                        <LocationOnRoundedIcon color="primary" />
                        <Typography>India</Typography>
                      </Stack>
                      <Stack direction="row" spacing={1} alignItems="center">
                        <WorkHistoryRoundedIcon color="primary" />
                        <Typography>Frontend Development</Typography>
                      </Stack>
                      <Stack direction="row" spacing={1} alignItems="center">
                        <MenuBookRoundedIcon color="primary" />
                        <Typography>Strong UI and component design focus</Typography>
                      </Stack>
                    </Stack>
                  </Paper>
                </Stack>
              </Grid>
            </Grid>
          </Paper>

          <Grid container spacing={3} className="content-grid">
            <Grid size={{ xs: 12, md: 8 }}>
              <Stack spacing={3}>
                <Card elevation={0} className="section-card">
                  <CardContent>
                    <Typography variant="h4" gutterBottom>
                      Professional Summary
                    </Typography>
                    <Typography variant="body1" color="text.secondary">
                      Motivated computer engineering student with hands-on practice in building responsive web
                      interfaces. Comfortable creating reusable UI components, organizing content-heavy layouts, and
                      shaping ideas into presentable digital products.
                    </Typography>
                  </CardContent>
                </Card>

                <Card elevation={0} className="section-card" id="experience">
                  <CardContent>
                    <Typography variant="h4" gutterBottom>
                      Experience
                    </Typography>
                    <Stack spacing={2.5}>
                      {experiences.map((item) => (
                        <Paper key={item.role} elevation={0} className="timeline-card">
                          <Stack spacing={1.5}>
                            <Stack
                              direction={{ xs: 'column', sm: 'row' }}
                              justifyContent="space-between"
                              spacing={1}
                            >
                              <Box>
                                <Typography variant="h6">{item.role}</Typography>
                                <Typography color="primary.main" fontWeight={600}>
                                  {item.company}
                                </Typography>
                              </Box>
                              <Chip label={item.period} variant="outlined" />
                            </Stack>
                            <List dense disablePadding>
                              {item.points.map((point) => (
                                <ListItem key={point} disableGutters>
                                  <ListItemIcon className="bullet-icon">
                                    <StarRoundedIcon color="secondary" fontSize="small" />
                                  </ListItemIcon>
                                  <ListItemText primary={point} />
                                </ListItem>
                              ))}
                            </List>
                          </Stack>
                        </Paper>
                      ))}
                    </Stack>
                  </CardContent>
                </Card>

                <Card elevation={0} className="section-card" id="projects">
                  <CardContent>
                    <Typography variant="h4" gutterBottom>
                      Projects
                    </Typography>
                    <Grid container spacing={2}>
                      {projects.map((project) => (
                        <Grid key={project.name} size={{ xs: 12, sm: 6, lg: 4 }}>
                          <Paper elevation={0} className="project-card">
                            <Typography variant="h6" gutterBottom>
                              {project.name}
                            </Typography>
                            <Typography variant="body2" color="text.secondary">
                              {project.description}
                            </Typography>
                          </Paper>
                        </Grid>
                      ))}
                    </Grid>
                  </CardContent>
                </Card>
              </Stack>
            </Grid>

            <Grid size={{ xs: 12, md: 4 }}>
              <Stack spacing={3}>
                <Card elevation={0} className="section-card">
                  <CardContent>
                    <Typography variant="h5" gutterBottom>
                      Skills
                    </Typography>
                    <Stack direction="row" spacing={1} useFlexGap flexWrap="wrap">
                      {skills.map((skill) => (
                        <Chip key={skill} label={skill} className="skill-chip" />
                      ))}
                    </Stack>
                  </CardContent>
                </Card>

                <Card elevation={0} className="section-card">
                  <CardContent>
                    <Stack direction="row" spacing={1} alignItems="center" sx={{ mb: 1 }}>
                      <SchoolRoundedIcon color="primary" />
                      <Typography variant="h5">Education</Typography>
                    </Stack>
                    <List dense>
                      {education.map((item) => (
                        <ListItem key={item} disableGutters>
                          <ListItemText primary={item} />
                        </ListItem>
                      ))}
                    </List>
                  </CardContent>
                </Card>

                <Card elevation={0} className="section-card" id="contact">
                  <CardContent>
                    <Typography variant="h5" gutterBottom>
                      Contact
                    </Typography>
                    <List dense>
                      <ListItem disableGutters>
                        <ListItemIcon>
                          <EmailRoundedIcon color="primary" />
                        </ListItemIcon>
                        <ListItemText primary="priya.sharma@email.com" />
                      </ListItem>
                      <ListItem disableGutters>
                        <ListItemIcon>
                          <PhoneRoundedIcon color="primary" />
                        </ListItemIcon>
                        <ListItemText primary="+91 98765 43210" />
                      </ListItem>
                      <ListItem disableGutters>
                        <ListItemIcon>
                          <LinkedInIcon color="primary" />
                        </ListItemIcon>
                        <ListItemText
                          primary={
                            <Link href="https://linkedin.com" underline="hover">
                              linkedin.com/in/yourprofile
                            </Link>
                          }
                        />
                      </ListItem>
                      <ListItem disableGutters>
                        <ListItemIcon>
                          <GitHubIcon color="primary" />
                        </ListItemIcon>
                        <ListItemText
                          primary={
                            <Link href="https://github.com" underline="hover">
                              github.com/yourusername
                            </Link>
                          }
                        />
                      </ListItem>
                      <ListItem disableGutters>
                        <ListItemIcon>
                          <LanguageRoundedIcon color="primary" />
                        </ListItemIcon>
                        <ListItemText primary="Portfolio available on request" />
                      </ListItem>
                    </List>
                    <Divider className="contact-divider" />
                    <Typography variant="body2" color="text.secondary">
                      Replace the sample data with your own academic details, experience, and social links.
                    </Typography>
                  </CardContent>
                </Card>
              </Stack>
            </Grid>
          </Grid>
        </Container>
      </Box>
    </ThemeProvider>
  );
}

export default App;
