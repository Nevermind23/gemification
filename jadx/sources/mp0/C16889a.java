package mp0;

import dp0.C12419a;
import g91.C32289b0;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p601sg.C17780e;

/* renamed from: mp0.a */
public final class C16889a {
    /* renamed from: a */
    public final CreditCardSmallPickerView.C13279b.C13281b mo44058a(C12419a aVar) {
        String str;
        C41536l.m120489i(aVar, "account");
        String d = aVar.mo33023f().mo89541d();
        Integer num = null;
        if (d != null) {
            str = C32289b0.m95091c(d);
        } else {
            str = null;
        }
        boolean h = aVar.mo33025h();
        if (aVar.mo33023f().mo89541d() == null) {
            num = Integer.valueOf(C17780e.ic_credit_card_empty);
        }
        return new CreditCardSmallPickerView.C13279b.C13281b(str, num, C32343x.m95410Q(aVar.mo33020d(), aVar.mo33024g(), false, 2, (Object) null), h, String.valueOf(aVar.mo33018b()));
    }
}
