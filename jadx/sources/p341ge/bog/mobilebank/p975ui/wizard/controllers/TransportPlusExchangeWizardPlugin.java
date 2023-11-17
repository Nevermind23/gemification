package p341ge.bog.mobilebank.p975ui.wizard.controllers;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.text.TextUtils;
import c91.C31329q;
import g91.C32303f;
import g91.C32359z0;
import java.math.BigDecimal;
import java.util.ArrayList;
import jg1.C41438c;
import jg1.C41452l;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.eventbus.events.PointValueExchangeEvent;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import r90.C27950a;
import rw0.C38375b;
import rw0.C38380g;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.TransportPlusExchangeWizardPlugin */
public class TransportPlusExchangeWizardPlugin extends BaseWizardPlugin {
    private static final int AMOUNT_INDEX = 1;
    private String availablePoints;
    private String pointAmount;
    private boolean waitingForResponse;

    public TransportPlusExchangeWizardPlugin() {
    }

    private String getAmountToExchange() {
        try {
            return String.valueOf(new BigDecimal(getWizardFragments().get(1).mo71611z1()).multiply(new BigDecimal(100)).setScale(0, 1));
        } catch (Exception unused) {
            return "";
        }
    }

    private void getPointValueExchange(String str) {
        if (!TextUtils.isEmpty(str) && !BankApiResponse.SUCCESSFUL_RESPONSE_CODE.equals(str)) {
            ((AdvancedWizardActivity) getWizardCallback()).mo87833I3().getPointValueExchange(str, C38375b.m112712h(str, ""), "");
        }
    }

    private void registerToEventBus() {
        if (!C41438c.m120237c().mo96183k(this)) {
            C41438c.m120237c().mo96185q(this);
        }
    }

    private void setPointValue(String str, boolean z) {
        String str2;
        this.waitingForResponse = z;
        this.pointAmount = str;
        String a0 = C32359z0.m95557a0(C10328q.payments_plus_points);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.pointAmount)) {
            str2 = C32303f.m95207r(this.pointAmount);
        } else {
            str2 = "";
        }
        arrayList.add(0, new KeyValue(a0, str2));
        ((C31329q) getWizardCallback().mo87842f0().get(1)).mo71618t2(arrayList);
    }

    public Intent getData() {
        return super.getData();
    }

    public void onFragmentsSet() {
        super.onFragmentsSet();
        registerToEventBus();
        String a0 = C32359z0.m95557a0(C10328q.bonus_exchange_available_plus_points);
        getWizardFragments().get(1).mo71707D1().setPageTitle(a0 + ": " + C32303f.m95207r(this.availablePoints));
        onInputChanged(1);
    }

    public void onInputChanged(int i) {
        super.onInputChanged(i);
        if (i == 1 && getWizardFragments() != null && getWizardFragments().size() > i && getWizardFragments().get(i) != null) {
            BigDecimal b = C38380g.m112735b(getWizardFragments().get(i).mo71611z1());
            if (b != null) {
                getPointValueExchange(String.valueOf(b));
            } else {
                setPointValue("", false);
            }
        }
    }

    public void onInputVerificationRequired(int i) {
        super.onInputVerificationRequired(i);
        ActivityManager.isUserAMonkey();
    }

    public void onNextClick(int i) {
        if (i != 1) {
            super.onNextClick(i);
            setPointValue(this.pointAmount, this.waitingForResponse);
        } else if (this.waitingForResponse) {
            onInputChanged(i);
        } else if (C38375b.m112705a(this.pointAmount, this.availablePoints, (Activity) getWizardCallback())) {
            super.onNextClick(i);
        }
    }

    @C41452l
    public void onPointExchangeEvent(PointValueExchangeEvent pointValueExchangeEvent) {
        boolean z;
        ActivityManager.isUserAMonkey();
        if (getAmountToExchange().equals(pointValueExchangeEvent.amount) && TextUtils.isEmpty(pointValueExchangeEvent.serviceProviderId)) {
            String pointValue = pointValueExchangeEvent.getPointValue();
            if (pointValueExchangeEvent.getState() != 20) {
                z = true;
            } else {
                z = false;
            }
            setPointValue(pointValue, z);
            int state = pointValueExchangeEvent.getState();
            if (state == 10) {
                getWizardCallback().mo87847q();
            } else if (state == 20) {
                getWizardCallback().mo87831D();
            } else if (state == 30) {
                getWizardCallback().mo87831D();
            } else if (state == 40) {
                getWizardCallback().mo87831D();
                getWizardCallback().mo87845n0(C27950a.m86284a(pointValueExchangeEvent.getErrorKey()));
            }
        }
    }

    public void onStart() {
        super.onStart();
        registerToEventBus();
    }

    public void onStop() {
        super.onStop();
        C41438c.m120237c().mo96186s(this);
    }

    public TransportPlusExchangeWizardPlugin(String str) {
        this.availablePoints = str;
        this.waitingForResponse = false;
        registerToEventBus();
    }
}
