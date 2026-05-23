package template;

import utils.MailUtils;

public class SendMail {

    public static void sendOtp(String email, String otp) {
        String title = "Mã OTP xác thực";

        String content = """
                <!DOCTYPE html>
                <html>
                <head>
                    <meta charset="UTF-8">
                </head>
                <body style="font-family: Arial; background-color:#f4f4f4; padding:20px;">

                    <div style="max-width:500px; margin:auto; background:white; padding:20px; border-radius:10px;">

                        <h2 style="color:#333;">Xác thực tài khoản</h2>

                        <p>Xin chào,</p>

                        <p>Mã OTP của bạn là:</p>

                        <div style="text-align:center; margin:20px 0;">
                            <span style="
                                font-size:28px;
                                font-weight:bold;
                                letter-spacing:5px;
                                color:#fff;
                                background:#ffc107;
                                padding:10px 20px;
                                border-radius:8px;
                            ">
                                %s
                            </span>
                        </div>

                        <p>Mã này có hiệu lực trong <b>5 phút</b>.</p>
                        <p>Vui lòng không chia sẻ mã này với bất kỳ ai.</p>

                        <p style="color:#888; font-size:12px;">
                            Nếu bạn không yêu cầu, hãy bỏ qua email này.
                        </p>

                    </div>

                </body>
                </html>
                """.formatted(otp);

        MailUtils.sendMail(email, title, content);
    }
}