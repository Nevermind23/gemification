package p716br;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;

/* renamed from: br.a */
public final class C19400a {

    /* renamed from: a */
    public static final C19400a f53623a = new C19400a();

    private C19400a() {
    }

    /* renamed from: b */
    public static /* synthetic */ WizardObject m64886b(C19400a aVar, String str, String str2, String str3, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            list = C41341q.m119907j();
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = new ArrayList(C41343r.m119925u(list3, 10));
            int i3 = 0;
            for (Object next : list3) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C41341q.m119917t();
                }
                String str4 = (String) next;
                list2.add(String.valueOf(i3));
                i3 = i4;
            }
        }
        List list4 = list2;
        if ((i2 & 32) != 0) {
            i = -1;
        }
        return aVar.mo47625a(str, str2, str3, list3, list4, i);
    }

    /* renamed from: e */
    public static /* synthetic */ WizardObject m64887e(C19400a aVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        return aVar.mo47627d(str, str2, str3, str4);
    }

    /* renamed from: a */
    public final WizardObject mo47625a(String str, String str2, String str3, List list, List list2, int i) {
        C41536l.m120489i(str, "inputTitle");
        C41536l.m120489i(str2, "pageTitle");
        C41536l.m120489i(str3, "id");
        C41536l.m120489i(list, "previews");
        C41536l.m120489i(list2, "values");
        WizardObject selectByString = new WizardObject().setInputStyle(5).setInputTitle(str).setPageTitle(str2).setId(str3).setSelectorOptionPreviews(list).setSelectorOptionValues(list2).setValue(String.valueOf(i)).setSelectByString(false);
        C41536l.m120488h(selectByString, "WizardObject()\n        .….setSelectByString(false)");
        return selectByString;
    }

    /* renamed from: c */
    public final WizardObject mo47626c(String str, String str2, List list, String str3, String str4) {
        C41536l.m120489i(str, "inputTitle");
        C41536l.m120489i(str2, "pageTitle");
        C41536l.m120489i(list, "previews");
        C41536l.m120489i(str3, "id");
        C41536l.m120489i(str4, C11755a.C11756a.f34100b);
        WizardObject value = new WizardObject().setInputStyle(0).setInputTitle(str).setPageTitle(str2).setSelectorOptionPreviews(list).setId(str3).setValue(str4);
        C41536l.m120488h(value, "WizardObject()\n         …         .setValue(value)");
        return value;
    }

    /* renamed from: d */
    public final WizardObject mo47627d(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "inputTitle");
        C41536l.m120489i(str2, "pageTitle");
        C41536l.m120489i(str3, "id");
        C41536l.m120489i(str4, C11755a.C11756a.f34100b);
        WizardObject value = new WizardObject().setInputStyle(1).setInputTitle(str).setPageTitle(str2).setId(str3).setValue(str4);
        C41536l.m120488h(value, "WizardObject()\n         …         .setValue(value)");
        return value;
    }

    /* renamed from: f */
    public final String mo47628f(LookupUiModel lookupUiModel) {
        C41536l.m120489i(lookupUiModel, "lookupUiModel");
        return C32343x.m95420V(lookupUiModel.mo52391a(), lookupUiModel.mo52393d(), new Object[0]);
    }
}
