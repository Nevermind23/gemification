package iw0;

import bw0.C31209b;
import g91.C32289b0;
import g91.C32343x;
import jw0.C36806c;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;

/* renamed from: iw0.a */
public final class C36560a {
    /* renamed from: b */
    public static /* synthetic */ C36806c m108403b(C36560a aVar, C31209b bVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return aVar.mo89391a(bVar, i, z);
    }

    /* renamed from: a */
    public final C36806c mo89391a(C31209b bVar, int i, boolean z) {
        C31209b bVar2 = bVar;
        C41536l.m120489i(bVar, "card");
        CreditCardSmallPickerView.C13279b.C13281b bVar3 = new CreditCardSmallPickerView.C13279b.C13281b(C32289b0.m95091c(bVar.mo71438f().mo89541d()), (Integer) null, C32343x.m95410Q(bVar.mo71434c(), bVar.mo71440h(), false, 2, (Object) null), bVar.mo71445l(), String.valueOf(bVar.mo71435d()));
        String k = bVar.mo71444k();
        if (!z) {
            k = k + " **" + bVar.mo71443j();
        }
        return new C36806c(i, bVar3, k, bVar.mo71434c(), bVar.mo71432a(), bVar.mo71440h());
    }
}
