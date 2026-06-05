import React from "react";
import "../CSS/Landingpage.css";
import { FaMapMarkerAlt, FaUsers, FaShieldAlt, FaThumbsUp } from "react-icons/fa";

// 👉 IMPORT YOUR IMAGE
import A1 from "../../assets/A1.png";   // adjust path if needed

export default function LandingPage() {
  return (
    <div className="landing">

      {/* Navbar */}
      <nav className="navbar">
        <div className="logo">
          <FaMapMarkerAlt /> ProNearby
        </div>

        <ul className="nav-links">
          <li className="active">Home</li>
          <li>Features</li>
          <li>Services</li>
          <li>How It Works</li>
          <li>Testimonials</li>
          <li>FAQ</li>
          <li>Contact</li>
        </ul>

        <div className="nav-right">
          <span className="login">Log In</span>
          <button className="signup">Sign Up</button>
        </div>
      </nav>

      {/* Hero Section */}
      <section className="hero">
        <div className="hero-left">
          <span className="tag">✨ Your Service, Our Priority</span>

          <h1>
            All Your Home Services <br />
            <span>One Click Away!</span>
          </h1>

          <p>
            ProNearby connects you with trusted professionals for all your home service needs.
            Fast, reliable and hassle-free booking at your fingertips.
          </p>

          <div className="hero-buttons">
            <button className="primary">Book a Service →</button>
            <button className="secondary">Explore Services</button>
          </div>

          {/* Features */}
          <div className="hero-features">
            <div>
              <FaShieldAlt /> Verified Professionals
            </div>
            <div>
              <FaThumbsUp /> Quality Service
            </div>
            <div>
              <FaUsers /> Secure Payments
            </div>
          </div>
        </div>

        {/* ✅ UPDATED IMAGE */}
        <div className="hero-right">
          <img src={A1} alt="ProNearby App Preview" />
        </div>
      </section>

      {/* Why Section */}
      <section className="why">
        <h2>Making Home Services Simple & Reliable</h2>
        <p>We bring convenience, quality and trust together.</p>

        <div className="features-grid">
          <div className="feature-card">
            <h4>Wide Range of Services</h4>
            <p>Cleaning, repair, electrical and more.</p>
          </div>

          <div className="feature-card">
            <h4>Easy Booking</h4>
            <p>Book services in just a few taps.</p>
          </div>

          <div className="feature-card">
            <h4>Verified Professionals</h4>
            <p>Background checked experts.</p>
          </div>

          <div className="feature-card">
            <h4>Affordable Pricing</h4>
            <p>Transparent and fair pricing.</p>
          </div>

          <div className="feature-card">
            <h4>Customer Support</h4>
            <p>24/7 assistance for users.</p>
          </div>
        </div>
      </section>

      {/* Stats */}
      <section className="stats">
        <div>10K+ Customers</div>
        <div>5K+ Providers</div>
        <div>99% Satisfaction</div>
        <div>24/7 Support</div>
      </section>

    </div>
  );
}