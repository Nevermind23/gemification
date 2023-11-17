package q31;

import android.content.Context;
import androidx.fragment.app.C1483c;
import gj0.C24731c;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsActivity;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;

/* renamed from: q31.e */
public final class C38121e implements C38120d {
    /* renamed from: a */
    public void mo91646a(Context context, boolean z, long j) {
        C41536l.m120489i(context, "context");
        GiftCardsActivity.f62414H.mo61584a(context, new GiftCardsFlow.GiftCardIntroduction(z, false, j, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: b */
    public void mo91647b(Context context, boolean z, long j) {
        C41536l.m120489i(context, "context");
        GiftCardsActivity.f62414H.mo61584a(context, new GiftCardsFlow.GiftCardDetails(z, j));
    }

    /* renamed from: c */
    public C1483c mo91648c(List list) {
        C41536l.m120489i(list, "data");
        return C24731c.C24732a.m79311b(C24731c.f63613R, list, false, 2, (Object) null);
    }
}
