import './App.css';
import Helloclass from './component/HelloClass.js';
import Hellofun from './component/HelloFun.js';
import Navbar from './component/Navbar.js';

function App() {
  return (
    <div>
      <Navbar />
      <Helloclass />
      <Hellofun />
    </div>
  );
}

export default App;
