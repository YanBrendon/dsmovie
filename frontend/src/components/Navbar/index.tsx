import { ReactComponent as GitHubIcon } from 'assets/img/github.svg';

import './styles.css';
function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-contant">
                    <h1 className="dsmovie-contact-title">DSMovie</h1>
                    <a href="https://github.com/YanBrendon" >
                        <div className="dsmovie-contact-container">
                            <GitHubIcon />
                            <p className="dsmovie-contatc-link">/YanBrendon</p>
                        </div></a>
                </div>
            </nav>
        </header>)
}



export default Navbar