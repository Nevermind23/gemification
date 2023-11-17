package com.github.mikephil.charting.formatter;

import java.text.DecimalFormat;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

public class DefaultValueFormatter extends ValueFormatter {
    protected int mDecimalDigits;
    protected DecimalFormat mFormat;

    public DefaultValueFormatter(int i) {
        setup(i);
    }

    public int getDecimalDigits() {
        return this.mDecimalDigits;
    }

    public String getFormattedValue(float f) {
        return this.mFormat.format((double) f);
    }

    public void setup(int i) {
        this.mDecimalDigits = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append(BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
        }
        this.mFormat = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
