package rw0;

import android.text.TextUtils;
import c91.C31331s;
import c91.C31355y;
import g91.C32319m;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin;

/* renamed from: rw0.f */
public final class C38379f {

    /* renamed from: a */
    private ArrayList f91969a = new ArrayList();

    /* renamed from: b */
    public PaymentWizardPlugin f91970b;

    public C38379f(PaymentWizardPlugin paymentWizardPlugin) {
        this.f91970b = paymentWizardPlugin;
    }

    /* renamed from: a */
    public int mo91902a() {
        Iterator<C31355y> it = this.f91970b.getWizardFragments().iterator();
        while (it.hasNext()) {
            C31355y next = it.next();
            if ((next instanceof C31331s) && next.mo71707D1().getInputType() == 302) {
                return next.mo71707D1().getSelectedSubTemplateItem();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public String mo91903b(String str) {
        return mo91904c(str, false);
    }

    /* renamed from: c */
    public String mo91904c(String str, boolean z) {
        C31355y yVar;
        boolean z2;
        int i;
        if (str != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f91970b.getWizardFragments().size()) {
                    break;
                }
                yVar = this.f91970b.getWizardFragments().get(i2);
                if (!this.f91969a.contains(Integer.valueOf(i2))) {
                    int i3 = i2 + 1;
                    if (i3 < this.f91970b.getWizardFragments().size() && this.f91970b.getWizardFragments().get(i3).mo71707D1().getId().equals(str)) {
                        this.f91969a.add(Integer.valueOf(i2));
                    }
                    if (str.equals(yVar.mo71707D1().getId())) {
                        try {
                            Integer.parseInt(yVar.mo71707D1().getValue());
                            z2 = true;
                        } catch (Exception unused) {
                            z2 = false;
                        }
                        if (yVar.mo71707D1().getInputStyle() == 0 && z2) {
                            if (yVar.mo71707D1().getValue() != null) {
                                i = Integer.parseInt(yVar.mo71707D1().getValue());
                            } else {
                                i = -1;
                            }
                            if (i >= 0) {
                                if (!z) {
                                    return yVar.mo71707D1().getSelectorOptionValues().get(Integer.parseInt(yVar.mo71707D1().getValue()));
                                }
                                return yVar.mo71707D1().getSelectorOptionPreviews().get(Integer.parseInt(yVar.mo71707D1().getValue()));
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            }
            if (yVar.mo71707D1().getInputStyle() != 2) {
                if (!z) {
                    return yVar.mo71707D1().getValue();
                }
                return yVar.mo71707D1().getVisibleInput();
            } else if (!z) {
                return yVar.mo71707D1().getValue();
            } else {
                if (!TextUtils.isEmpty(yVar.mo71707D1().getValue())) {
                    return C32319m.m95297d(Long.parseLong(yVar.mo71707D1().getValue()), "dd.MM.yyyy");
                }
            }
        }
        return "";
    }

    /* renamed from: d */
    public String mo91905d(String str) {
        return mo91904c(str, true);
    }
}
