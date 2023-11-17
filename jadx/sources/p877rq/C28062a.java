package p877rq;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32314k;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel;
import p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p716br.C19400a;
import p797jq.C25480a;

/* renamed from: rq.a */
public final class C28062a {

    /* renamed from: a */
    public static final C28062a f71410a = new C28062a();

    private C28062a() {
    }

    /* renamed from: h */
    private final Spannable m86477h(String str, int i) {
        SpannableString spannableString = new SpannableString(C32343x.m95388F(str + ".value", new Object[0]));
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    public final WizardObject mo67604a(int i) {
        return C19400a.m64886b(C19400a.f53623a, C32343x.m95388F("offers.become.solo.appl.details.field.wizard.select.lounge", new Object[0]), C32343x.m95388F("offers.become.solo.appl.details.field.wizard.select.lounge", new Object[0]), "SOLO_LOUNGE_BRANCH", (List) null, (List) null, i, 24, (Object) null);
    }

    /* renamed from: b */
    public final WizardObject mo67605b(BecomeSoloApplicationDataUiModel becomeSoloApplicationDataUiModel, int i) {
        ArrayList arrayList;
        C41536l.m120489i(becomeSoloApplicationDataUiModel, "data");
        C19400a aVar = C19400a.f53623a;
        String F = C32343x.m95388F("offers.become.solo.appl.details.field.wizard.select.city", new Object[0]);
        String F2 = C32343x.m95388F("offers.become.solo.appl.details.field.wizard.select.city", new Object[0]);
        List<ServiceCenterUiModel> f = becomeSoloApplicationDataUiModel.mo49596e().mo49709f();
        if (f != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(f, 10));
            for (ServiceCenterUiModel d : f) {
                arrayList2.add(d.mo49705d());
            }
            arrayList = arrayList2;
        } else {
            arrayList = C41341q.m119907j();
        }
        return C19400a.m64886b(aVar, F, F2, "SOLO_LOUNGE_CITY", arrayList, (List) null, i, 16, (Object) null);
    }

    /* renamed from: c */
    public final WizardObject mo67606c(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        WizardObject value = C19400a.m64887e(C19400a.f53623a, C32343x.m95388F("offers.become.solo.appl.details.field.name.contact.number", new Object[0]), C32343x.m95388F("offers.become.solo.appl.details.field.name.contact.number", new Object[0]), "CONTACT_NUMBER", (String) null, 8, (Object) null).setInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE).setValidatePattern("^([0-9]{9}|[0-9]{12}|[+0-9]{13})$").setValue(str);
        C41536l.m120488h(value, "getTextWizardObject(\n   …         .setValue(value)");
        return value;
    }

    /* renamed from: d */
    public final WizardObject mo67607d(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        WizardObject inputType = C19400a.m64887e(C19400a.f53623a, C32343x.m95388F("offers.become.solo.appl.details.field.name.deposit.amount", new Object[0]), C32343x.m95388F("offers.become.solo.appl.details.field.name.deposit.amount", new Object[0]), "DEPOSIT_AMOUNT", (String) null, 8, (Object) null).setInputType(BogInputLayout.INPUT_TYPE_NUM_DIGIT);
        String a = C32314k.m95245a("GEL");
        WizardObject value = inputType.setNonSelectableString(" " + a).setValue(str);
        C41536l.m120488h(value, "getTextWizardObject(\n   …\n        .setValue(value)");
        return value;
    }

    /* renamed from: e */
    public final WizardObject mo67608e(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        C19400a aVar = C19400a.f53623a;
        String F = C32343x.m95388F("offers.become.solo.appl.details.field.name.deposit", new Object[0]);
        String F2 = C32343x.m95388F("offers.become.solo.appl.details.field.name.deposit", new Object[0]);
        List<String> a = C25480a.f65145a.mo64043a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (String F3 : a) {
            arrayList.add(C32343x.m95388F(F3, new Object[0]));
        }
        return aVar.mo47626c(F, F2, arrayList, "DEPOSIT_PROMPT", str);
    }

    /* renamed from: f */
    public final WizardObject mo67609f(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        WizardObject value = C19400a.m64887e(C19400a.f53623a, C32343x.m95388F("offers.become.solo.appl.details.field.name.contact.email", new Object[0]), C32343x.m95388F("offers.become.solo.appl.details.field.name.contact.email", new Object[0]), "EMAIL", (String) null, 8, (Object) null).setInputType(BogInputLayout.INPUT_TYPE_EMAIL).setValidatePattern("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$").setValue(str);
        C41536l.m120488h(value, "getTextWizardObject(\n   …         .setValue(value)");
        return value;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r10 == null) goto L_0x0078;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject mo67610g(p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel r10, p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r11) {
        /*
            r9 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            br.a r1 = p716br.C19400a.f53623a
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "offers.become.solo.appl.details.field.wizard.income.range"
            java.lang.String r2 = g91.C32343x.m95388F(r3, r2)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r4)
            ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloDropdownValuesUiModel r4 = r10.mo49593b()
            java.util.List r4 = r4.mo49603b()
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = ie1.C41343r.m119925u(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x002d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0041
            java.lang.Object r6 = r4.next()
            ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r6 = (p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel) r6
            java.lang.String r6 = r1.mo47628f(r6)
            r5.add(r6)
            goto L_0x002d
        L_0x0041:
            java.lang.String r6 = "MONTHLY_INCOME"
            if (r11 == 0) goto L_0x0078
            ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloDropdownValuesUiModel r10 = r10.mo49593b()
            java.util.List r10 = r10.mo49603b()
            java.util.Iterator r10 = r10.iterator()
            r4 = r0
        L_0x0052:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x0071
            java.lang.Object r7 = r10.next()
            ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r7 = (p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel) r7
            int r7 = r7.mo52395e()
            int r8 = r11.mo52395e()
            if (r7 != r8) goto L_0x006a
            r7 = 1
            goto L_0x006b
        L_0x006a:
            r7 = r0
        L_0x006b:
            if (r7 == 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            int r4 = r4 + 1
            goto L_0x0052
        L_0x0071:
            r4 = -1
        L_0x0072:
            java.lang.String r10 = java.lang.String.valueOf(r4)
            if (r10 != 0) goto L_0x007a
        L_0x0078:
            java.lang.String r10 = "-1"
        L_0x007a:
            r4 = r5
            r5 = r6
            r6 = r10
            ge.bog.mobilebank.ui.wizard.model.WizardObject r10 = r1.mo47626c(r2, r3, r4, r5, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p877rq.C28062a.mo67610g(ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel, ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel):ge.bog.mobilebank.ui.wizard.model.WizardObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r13 == null) goto L_0x0078;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject mo67611i(p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel r12, p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            br.a r1 = p716br.C19400a.f53623a
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "offers.become.solo.appl.details.field.name.solo.payment.type"
            java.lang.String r2 = g91.C32343x.m95388F(r3, r2)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r4)
            ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloDropdownValuesUiModel r4 = r12.mo49593b()
            java.util.List r4 = r4.mo49602a()
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r6 = ie1.C41343r.m119925u(r4, r7)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x002d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0041
            java.lang.Object r6 = r4.next()
            ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r6 = (p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel) r6
            java.lang.String r6 = r1.mo47628f(r6)
            r5.add(r6)
            goto L_0x002d
        L_0x0041:
            java.lang.String r6 = "PAYMENT_TYPE"
            if (r13 == 0) goto L_0x0078
            ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloDropdownValuesUiModel r4 = r12.mo49593b()
            java.util.List r4 = r4.mo49602a()
            java.util.Iterator r4 = r4.iterator()
            r8 = r0
        L_0x0052:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0071
            java.lang.Object r9 = r4.next()
            ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r9 = (p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel) r9
            int r9 = r9.mo52395e()
            int r10 = r13.mo52395e()
            if (r9 != r10) goto L_0x006a
            r9 = 1
            goto L_0x006b
        L_0x006a:
            r9 = r0
        L_0x006b:
            if (r9 == 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            int r8 = r8 + 1
            goto L_0x0052
        L_0x0071:
            r8 = -1
        L_0x0072:
            java.lang.String r13 = java.lang.String.valueOf(r8)
            if (r13 != 0) goto L_0x007a
        L_0x0078:
            java.lang.String r13 = "-1"
        L_0x007a:
            r4 = r5
            r5 = r6
            r6 = r13
            ge.bog.mobilebank.ui.wizard.model.WizardObject r13 = r1.mo47626c(r2, r3, r4, r5, r6)
            r1 = 7
            ge.bog.mobilebank.ui.wizard.model.WizardObject r13 = r13.setInputStyle(r1)
            ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloDropdownValuesUiModel r12 = r12.mo49593b()
            java.util.List r12 = r12.mo49602a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = ie1.C41343r.m119925u(r12, r7)
            r1.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
        L_0x009b:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x00c0
            java.lang.Object r2 = r12.next()
            ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r2 = (p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel) r2
            ge.bog.mobilebank.ui.wizard.model.WizardTitleDescriptionObject r3 = new ge.bog.mobilebank.ui.wizard.model.WizardTitleDescriptionObject
            br.a r4 = p716br.C19400a.f53623a
            java.lang.String r4 = r4.mo47628f(r2)
            rq.a r5 = f71410a
            java.lang.String r2 = r2.mo52391a()
            android.text.Spannable r2 = r5.m86477h(r2, r14)
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L_0x009b
        L_0x00c0:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r1)
            r13.setCustomSelectorValues(r12)
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r14 = "offers.become.solo.campaign.no.commission"
            java.lang.String r12 = g91.C32343x.m95388F(r14, r12)
            java.lang.String r1 = " "
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r12, r1)
            if (r12 != 0) goto L_0x00df
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r12 = g91.C32343x.m95388F(r14, r12)
            goto L_0x00e0
        L_0x00df:
            r12 = 0
        L_0x00e0:
            ge.bog.mobilebank.ui.wizard.model.WizardObject r12 = r13.setDescriptionText(r12)
            java.lang.String r13 = "getSelectorWizardObject(…      else null\n        )"
            kotlin.jvm.internal.C41536l.m120488h(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p877rq.C28062a.mo67611i(ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel, ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel, int):ge.bog.mobilebank.ui.wizard.model.WizardObject");
    }

    /* renamed from: j */
    public final WizardObject mo67612j(int i) {
        return C19400a.m64886b(C19400a.f53623a, C32343x.m95388F("offers.become.solo.appl.details.field.wizard.select.region", new Object[0]), C32343x.m95388F("offers.become.solo.appl.details.field.wizard.select.region", new Object[0]), "SOLO_LOUNGE_REGION", (List) null, (List) null, i, 24, (Object) null);
    }

    /* renamed from: k */
    public final WizardObject mo67613k(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        WizardObject value = C19400a.m64887e(C19400a.f53623a, C32343x.m95388F("offers.become.solo.appl.details.field.name.employer", new Object[0]), C32343x.m95388F("offers.become.solo.appl.details.field.name.employer", new Object[0]), "WORK_PLACE", (String) null, 8, (Object) null).setValue(str);
        C41536l.m120488h(value, "getTextWizardObject(\n   …        ).setValue(value)");
        return value;
    }
}
