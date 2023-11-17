package p341ge.bog.mobilebank.payment.controllers.wizard;

import android.text.TextUtils;
import c91.C31329q;
import c91.C31355y;
import g91.C32303f;
import g91.C32359z0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import rw0.C38375b;
import rw0.C38380g;

@Parcel
/* renamed from: ge.bog.mobilebank.payment.controllers.wizard.PointPaymentWizardPlugin */
public class PointPaymentWizardPlugin extends PaymentWizardPlugin {
    protected String availablePoints;
    private boolean waitingForResponse;

    private void addPoints() {
        String a0 = C32359z0.m95557a0(C10328q.bonus_exchange_available_plus_points);
        getWizardFragments().get(getWizardFragments().size() - 1).mo71707D1().setPageTitle(a0 + ": " + C32303f.m95207r(getAvailablePoints()));
    }

    private C31355y getPlusFragment() {
        try {
            Iterator<C31355y> it = getWizardFragments().iterator();
            while (it.hasNext()) {
                C31355y next = it.next();
                if ("amount_to_pay_with_point".equals(next.mo71707D1().getId())) {
                    return next;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private void getPointValueExchange(String str) {
        if (!TextUtils.isEmpty(str) && !BankApiResponse.SUCCESSFUL_RESPONSE_CODE.equals(str)) {
            this.manager.paymentEventManager.mo91793a().getPointValueExchange(str, C38375b.m112712h(str, this.manager.customConfiguration.getBaseConfiguration().getServiceId()), this.manager.customConfiguration.getBaseConfiguration().getServiceId());
        }
    }

    public String getAmountToExchange() {
        try {
            return String.valueOf(new BigDecimal(getPlusFragment().mo71611z1()).multiply(new BigDecimal(100)).setScale(0, 1));
        } catch (Exception unused) {
            return "";
        }
    }

    public String getAvailablePoints() {
        return this.availablePoints;
    }

    public void onFragmentsSet() {
        super.onFragmentsSet();
        addPoints();
        if (this.manager.customConfiguration.getCustomParamByKey("point_value_param_id") != null) {
            setPlusPointValue(this.manager.customConfiguration.getCustomParamByKey("point_value_param_id").getValue(), false);
            if (getWizardFragments() != null) {
                onInputChanged(getWizardFragments().size() - 1);
            }
        }
    }

    public void onInputChanged(int i) {
        super.onInputChanged(i);
        if (getWizardFragments() != null && i < getWizardFragments().size() && getWizardFragments().get(i).mo71707D1() != null && "amount_to_pay_with_point".equals(getWizardFragments().get(i).mo71707D1().getId())) {
            BigDecimal b = C38380g.m112735b(getWizardFragments().get(i).mo71611z1());
            if (b != null) {
                getPointValueExchange(String.valueOf(b));
            } else {
                setPlusPointValue("", false);
            }
        }
    }

    public void onInputVerificationRequired(int i) {
        super.onInputVerificationRequired(i);
    }

    public void onNextClick(int i) {
        if (getWizardFragments() == null || i != getWizardFragments().size() - 1 || getWizardFragments().get(i).mo71707D1() == null || !"amount_to_pay_with_point".equals(getWizardFragments().get(i).mo71707D1().getId())) {
            super.onNextClick(i);
        } else if (this.waitingForResponse) {
            onInputChanged(i);
        } else if (C38375b.m112705a(this.manager.customConfiguration.getCustomParamByKey("point_value_param_id").getValue(), this.availablePoints, getWizardFragments().get(i).getActivity())) {
            super.onNextClick(i);
        }
    }

    public void setAvailablePoints(String str) {
        this.availablePoints = str;
    }

    public void setPlusPointValue(String str, boolean z) {
        String str2;
        String str3;
        this.waitingForResponse = z;
        String str4 = "";
        if (this.manager.customConfiguration.getCustomParamByKey("point_value_param_id") != null) {
            PaymentCustomParameter customParamByKey = this.manager.customConfiguration.getCustomParamByKey("point_value_param_id");
            if (z) {
                str2 = str4;
            } else {
                str2 = str;
            }
            customParamByKey.setValue(str2);
            PaymentCustomParameter customParamByKey2 = this.manager.customConfiguration.getCustomParamByKey("point_value_param_id");
            if (z) {
                str3 = str4;
            } else {
                str3 = C32303f.m95207r(str);
            }
            customParamByKey2.setValueToDisplay(str3);
        }
        C31355y plusFragment = getPlusFragment();
        if (plusFragment != null && plusFragment.mo71707D1() != null && (plusFragment instanceof C31329q)) {
            String a0 = C32359z0.m95557a0(C10328q.payments_plus_points);
            ArrayList<KeyValue> infoListKeyValues = plusFragment.mo71707D1().getInfoListKeyValues();
            if (infoListKeyValues == null) {
                infoListKeyValues = new ArrayList<>();
            }
            if (infoListKeyValues.size() > 0 && a0.equals(infoListKeyValues.get(0).getKey())) {
                infoListKeyValues.remove(0);
            }
            if (!TextUtils.isEmpty(str)) {
                str4 = C32303f.m95207r(str);
            }
            infoListKeyValues.add(0, new KeyValue(a0, str4));
            ((C31329q) plusFragment).mo71618t2(infoListKeyValues);
        }
    }
}
