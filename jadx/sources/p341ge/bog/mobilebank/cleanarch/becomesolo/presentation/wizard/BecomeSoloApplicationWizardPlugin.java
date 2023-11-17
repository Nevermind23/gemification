package p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.wizard;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c91.C31334t;
import c91.C31355y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel;
import p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.C35886a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p797jq.C25480a;
import p847oq.C27056a;

/* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.wizard.BecomeSoloApplicationWizardPlugin */
public final class BecomeSoloApplicationWizardPlugin extends BaseWizardPlugin implements Parcelable {
    public static final Parcelable.Creator<BecomeSoloApplicationWizardPlugin> CREATOR = new C20864a();

    /* renamed from: d */
    private final BecomeSoloApplicationDataUiModel f56143d;

    /* renamed from: e */
    private final List f56144e = C41341q.m119910m(C27056a.SOLO_LOUNGE_CITY, C27056a.SOLO_LOUNGE_REGION);

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.wizard.BecomeSoloApplicationWizardPlugin$a */
    public static final class C20864a implements Parcelable.Creator {
        /* renamed from: a */
        public final BecomeSoloApplicationWizardPlugin createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BecomeSoloApplicationWizardPlugin(BecomeSoloApplicationDataUiModel.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final BecomeSoloApplicationWizardPlugin[] newArray(int i) {
            return new BecomeSoloApplicationWizardPlugin[i];
        }
    }

    public BecomeSoloApplicationWizardPlugin(BecomeSoloApplicationDataUiModel becomeSoloApplicationDataUiModel) {
        C41536l.m120489i(becomeSoloApplicationDataUiModel, "data");
        this.f56143d = becomeSoloApplicationDataUiModel;
    }

    /* renamed from: a */
    private final void m67494a(Intent intent) {
        int i;
        int i2;
        Integer j;
        Integer j2;
        Integer j3;
        List f = this.f56143d.mo49596e().mo49709f();
        if (f != null) {
            String e = m67497e(6);
            int i3 = -1;
            if (e == null || (j3 = C40438v.m117098j(e)) == null) {
                i = -1;
            } else {
                i = j3.intValue();
            }
            ServiceCenterUiModel serviceCenterUiModel = (ServiceCenterUiModel) C41358y.m120010Z(f, i);
            if (serviceCenterUiModel != null) {
                intent.putExtra("SOLO_LOUNGE_CITY", String.valueOf(serviceCenterUiModel.mo49703a()));
                List f2 = serviceCenterUiModel.mo49709f();
                if (f2 != null) {
                    String e2 = m67497e(7);
                    if (e2 == null || (j2 = C40438v.m117098j(e2)) == null) {
                        i2 = -1;
                    } else {
                        i2 = j2.intValue();
                    }
                    ServiceCenterUiModel serviceCenterUiModel2 = (ServiceCenterUiModel) C41358y.m120010Z(f2, i2);
                    if (serviceCenterUiModel2 != null) {
                        intent.putExtra("SOLO_LOUNGE_REGION", String.valueOf(serviceCenterUiModel2.mo49703a()));
                        List f3 = serviceCenterUiModel2.mo49709f();
                        if (f3 != null) {
                            String e3 = m67497e(8);
                            if (!(e3 == null || (j = C40438v.m117098j(e3)) == null)) {
                                i3 = j.intValue();
                            }
                            ServiceCenterUiModel serviceCenterUiModel3 = (ServiceCenterUiModel) C41358y.m120010Z(f3, i3);
                            if (serviceCenterUiModel3 != null) {
                                intent.putExtra("SOLO_LOUNGE_BRANCH", String.valueOf(serviceCenterUiModel3.mo49703a()));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m67495b(Intent intent) {
        intent.putExtra("CONTACT_NUMBER", m67497e(0));
        intent.putExtra("EMAIL", m67497e(1));
        intent.putExtra("WORK_PLACE", m67497e(2));
        intent.putExtra("PAYMENT_TYPE", m67497e(9));
        intent.putExtra("MONTHLY_INCOME", m67497e(3));
        m67494a(intent);
        intent.putExtra("DEPOSIT_PROMPT", m67497e(4));
        intent.putExtra("DEPOSIT_AMOUNT", m67497e(5));
    }

    /* renamed from: d */
    private final C31355y m67496d(String str) {
        T t;
        ArrayList<C31355y> wizardFragments = getWizardFragments();
        C41536l.m120488h(wizardFragments, "wizardFragments");
        Iterator<T> it = wizardFragments.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C41536l.m120484d(((C31355y) t).mo71707D1().getId(), str)) {
                break;
            }
        }
        return (C31355y) t;
    }

    /* renamed from: e */
    private final String m67497e(int i) {
        WizardObject D1;
        ArrayList<C31355y> wizardFragments = getWizardFragments();
        C41536l.m120488h(wizardFragments, "wizardFragments");
        C31355y yVar = (C31355y) C41358y.m120010Z(wizardFragments, i);
        if (yVar == null || (D1 = yVar.mo71707D1()) == null) {
            return null;
        }
        return D1.getValue();
    }

    /* renamed from: f */
    private final List m67498f() {
        String z1;
        List f;
        Object obj;
        List<ServiceCenterUiModel> f2;
        boolean z;
        C31355y d = m67496d("SOLO_LOUNGE_CITY");
        ArrayList arrayList = null;
        if (!(d == null || (z1 = d.mo71611z1()) == null)) {
            int parseInt = Integer.parseInt(z1);
            if (parseInt == -1 || (f = this.f56143d.mo49596e().mo49709f()) == null) {
                return null;
            }
            long a = ((ServiceCenterUiModel) f.get(parseInt)).mo49703a();
            Iterator it = f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ServiceCenterUiModel) obj).mo49703a() == a) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            ServiceCenterUiModel serviceCenterUiModel = (ServiceCenterUiModel) obj;
            if (!(serviceCenterUiModel == null || (f2 = serviceCenterUiModel.mo49709f()) == null)) {
                arrayList = new ArrayList(C41343r.m119925u(f2, 10));
                for (ServiceCenterUiModel d2 : f2) {
                    arrayList.add(d2.mo49705d());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private final List m67499g() {
        int i;
        int i2;
        Long l;
        Long l2;
        Object obj;
        List f;
        Object obj2;
        List<ServiceCenterUiModel> f2;
        boolean z;
        boolean z2;
        List f3;
        ServiceCenterUiModel serviceCenterUiModel;
        String z1;
        String z12;
        C31355y d = m67496d("SOLO_LOUNGE_CITY");
        if (d == null || (z12 = d.mo71611z1()) == null) {
            i = -1;
        } else {
            i = Integer.parseInt(z12);
        }
        C31355y d2 = m67496d("SOLO_LOUNGE_REGION");
        if (d2 == null || (z1 = d2.mo71611z1()) == null) {
            i2 = -1;
        } else {
            i2 = Integer.parseInt(z1);
        }
        List f4 = this.f56143d.mo49596e().mo49709f();
        ArrayList arrayList = null;
        if (f4 == null) {
            return null;
        }
        if (i != -1) {
            l = Long.valueOf(((ServiceCenterUiModel) f4.get(i)).mo49703a());
        } else {
            l = null;
        }
        if (i2 == -1 || (f3 = ((ServiceCenterUiModel) f4.get(i)).mo49709f()) == null || (serviceCenterUiModel = (ServiceCenterUiModel) f3.get(i2)) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(serviceCenterUiModel.mo49703a());
        }
        Iterator it = f4.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long a = ((ServiceCenterUiModel) obj).mo49703a();
            if (l != null && a == l.longValue()) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        ServiceCenterUiModel serviceCenterUiModel2 = (ServiceCenterUiModel) obj;
        if (!(serviceCenterUiModel2 == null || (f = serviceCenterUiModel2.mo49709f()) == null)) {
            Iterator it2 = f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                long a2 = ((ServiceCenterUiModel) obj2).mo49703a();
                if (l2 != null && a2 == l2.longValue()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            ServiceCenterUiModel serviceCenterUiModel3 = (ServiceCenterUiModel) obj2;
            if (!(serviceCenterUiModel3 == null || (f2 = serviceCenterUiModel3.mo49709f()) == null)) {
                arrayList = new ArrayList(C41343r.m119925u(f2, 10));
                for (ServiceCenterUiModel d3 : f2) {
                    arrayList.add(d3.mo49705d());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private final void m67500h(int i) {
        C31355y yVar = getWizardFragments().get(i);
        String id = yVar.mo71707D1().getId();
        if (C41536l.m120484d(id, "SOLO_LOUNGE_REGION")) {
            WizardObject D1 = yVar.mo71707D1();
            List f = m67498f();
            if (f == null) {
                f = C41341q.m119907j();
            }
            D1.setSelectorOptionPreviews(f);
        } else if (C41536l.m120484d(id, "SOLO_LOUNGE_BRANCH")) {
            WizardObject D12 = yVar.mo71707D1();
            List g = m67499g();
            if (g == null) {
                g = C41341q.m119907j();
            }
            D12.setSelectorOptionPreviews(g);
        }
    }

    public C31355y createFragment(WizardObject wizardObject, int i) {
        boolean z = false;
        if (wizardObject != null && wizardObject.getInputStyle() == 7) {
            z = true;
        }
        if (z) {
            C31334t tVar = new C31334t();
            tVar.mo71713P1(i);
            tVar.mo71717U1(wizardObject.getValue());
            tVar.mo71709L1(wizardObject);
            return tVar;
        }
        C31355y createFragment = super.createFragment(wizardObject, i);
        C41536l.m120488h(createFragment, "super.createFragment(wo, index)");
        return createFragment;
    }

    public int describeContents() {
        return 0;
    }

    public Intent getData() {
        Intent intent = new Intent();
        m67495b(intent);
        return intent;
    }

    public void onNextClick(int i) {
        boolean z;
        String id = getWizardFragments().get(i).mo71707D1().getId();
        List list = this.f56144e;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C41536l.m120484d(((C27056a) it.next()).name(), id)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            m67500h(i + 1);
        }
        String e = m67497e(i);
        if (C41536l.m120484d(id, "DEPOSIT_PROMPT")) {
            if (e != null) {
                Integer j = C40438v.m117098j(e);
                int indexOf = C25480a.f65145a.mo64043a().indexOf("offers.become.solo.appl.details.field.name.deposit.value1");
                if (j != null && j.intValue() == indexOf) {
                    z2 = true;
                }
            }
            if (!z2) {
                onNextClick(i + 1);
                C35886a aVar = this.wizardCallback;
                C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.ui.wizard.activities.AdvancedWizardActivity");
                ((AdvancedWizardActivity) aVar).mo87963n3(i + 2, true);
                return;
            }
        }
        super.onNextClick(i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f56143d.writeToParcel(parcel, i);
    }
}
