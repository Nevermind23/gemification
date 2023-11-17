package s30;

import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o30.C26713c;
import o30.C26716f;
import p366bk.C10328q;

/* renamed from: s30.c */
public final class C28141c extends C26713c {

    /* renamed from: m */
    private final String f71490m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28141c(String str, int i) {
        super("TOTAL_DEBT_ITEM_ID", (Integer) null, (String) null, C36546y.m108285N().getString(C10328q.payments_label_all_bills), 0, false, (C26716f) null, 7, 0, 2, (Integer) null, (Integer) null, 3446, (DefaultConstructorMarker) null);
        String str2 = str;
        C41536l.m120489i(str2, "debtAmount");
        this.f71490m = str2;
    }

    /* renamed from: m */
    public final String mo67672m() {
        return this.f71490m;
    }
}
