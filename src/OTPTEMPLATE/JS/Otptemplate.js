import React from "react";
import "../CSS/otptemplate.css";

const Otptemplate = () => {
  const name = "Mamata";
  const otp = "4587";

  return (
    <div className="container">

      <div className="header">
        <div className="logo">ProNearby</div>
        <p>Find Trusted Professionals Near You</p>
      </div>

      <div className="content">
        <h2>Email Verification</h2>

        <p>Hello {name},</p>

        <p>Your verification code is:</p>

        <div className="otp-box">
          {otp}
        </div>

        <p>
          This OTP will expire in <b>10 minutes</b>.
        </p>

        <p className="note">
          Never share this OTP with anyone.
        </p>
      </div>

      <div className="footer">
        © 2026 ProNearby. All Rights Reserved.
      </div>

    </div>
  );
};

export default Otptemplate;