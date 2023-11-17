package com.github.mikephil.charting.formatter;

import java.text.DecimalFormat;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

public class DefaultAxisValueFormatter extends ValueFormatter {
    protected int digits;
    protected DecimalFormat mFormat;

    public DefaultAxisValueFormatter(int i) {
        this.digits = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append(BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public int getDecimalDigits() {
        return this.digits;
    }

    public String getFormattedValue(float f) {
        return this.mFormat.format((double) f);
    }
}
