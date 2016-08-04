/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

public class validations {

    private static boolean dot = false;

    /**
     *
     * @param textField
     * @param evt
     */
    public static void validateNumber(JTextField textField, KeyEvent evt) {
        char vChar = evt.getKeyChar();
        if (textField.getText().equals("")) {
            dot = false;
        }
        if (dot == false) {
            if (vChar == '.') {
                dot = true;
            } else if (!(Character.isDigit(vChar)
                    || (vChar == KeyEvent.VK_BACK_SPACE)
                    || (vChar == KeyEvent.VK_DELETE))) {
                evt.consume();
            }
        } else {
            if (!(Character.isDigit(vChar)
                    || (vChar == KeyEvent.VK_BACK_SPACE)
                    || (vChar == KeyEvent.VK_DELETE))) {
                evt.consume();
            }
        }

    }

    /**
     *
     * @param date1
     * @param date2
     * @return
     */
    public static boolean getYear(Date date1, Date date2) {
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("yyyy");
        Integer.parseInt(simpleDateformat.format(date1));

        int diff = Integer.parseInt(simpleDateformat.format(date2)) - Integer.parseInt(simpleDateformat.format(date1));
        return diff > 18;

    }

    /**
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(EMAIL_REGEX);
    }

}
