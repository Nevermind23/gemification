package w21;

import android.content.DialogInterface;
import android.os.Bundle;
import g91.C32343x;
import j31.C36726b;
import j31.C36727c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import l31.C37067b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.model.KeyValue;
import p380ck.C10464h;
import p769gr.C24776a;
import p779hr.C25051a;
import p779hr.C25052b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: w21.c */
public final class C39511c {

    /* renamed from: a */
    public static final C39511c f93958a = new C39511c();

    /* renamed from: w21.c$a */
    public static final class C39512a implements C25051a {

        /* renamed from: a */
        final /* synthetic */ C43075l f93959a;

        /* renamed from: b */
        final /* synthetic */ C24776a f93960b;

        C39512a(C43075l lVar, C24776a aVar) {
            this.f93959a = lVar;
            this.f93960b = aVar;
        }

        /* renamed from: a */
        public void mo63489a(DialogInterface dialogInterface) {
            C41536l.m120489i(dialogInterface, "dialog");
            this.f93959a.invoke(this.f93960b.mo63182e());
        }
    }

    private C39511c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m114841d(C24776a aVar, C25052b bVar, C43079p pVar, Button button) {
        C41536l.m120489i(aVar, "$commonPopup");
        C41536l.m120489i(bVar, "$this_with");
        C41536l.m120489i(pVar, "$positiveButtonListener");
        C41536l.m120489i(button, "<anonymous parameter 0>");
        C36726b f = aVar.mo63184f();
        if (f != null) {
            C37067b g = aVar.mo63185g();
            if (g != null) {
                C32343x.m95395I0(bVar, g.mo89997b(), "", g.mo89996a(), C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
            }
            String b = f.mo89547b();
            List<C36727c> a = f.mo89546a();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (C36727c cVar : a) {
                arrayList.add(new KeyValue(cVar.mo89551a(), cVar.mo89552b()));
            }
            pVar.invoke(b, arrayList);
        }
        bVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m114842e(C24776a aVar, C25052b bVar, Button button) {
        C41536l.m120489i(aVar, "$commonPopup");
        C41536l.m120489i(bVar, "$this_with");
        C41536l.m120489i(button, "<anonymous parameter 0>");
        C37067b c = aVar.mo63180c();
        if (c != null) {
            C32343x.m95395I0(bVar, c.mo89997b(), "", c.mo89996a(), C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        }
        bVar.mo4577k1();
    }

    /* renamed from: c */
    public final C25052b mo93146c(C24776a aVar, C43079p pVar, C43075l lVar) {
        C41536l.m120489i(aVar, "commonPopup");
        C41536l.m120489i(pVar, "positiveButtonListener");
        C41536l.m120489i(lVar, "dismissListener");
        C25052b bVar = new C25052b();
        bVar.mo35648c2(aVar.mo63188i());
        bVar.mo35639Q1(aVar.mo63179b());
        bVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        bVar.mo35636N1(PageDescriptionView.C13421b.IMAGE);
        bVar.mo35635M1(aVar.mo63178a());
        bVar.mo35646Z1(aVar.mo63186h());
        bVar.mo35642U1(aVar.mo63181d());
        bVar.mo4586v1(false);
        bVar.mo35645Y1(new C39509a(aVar, bVar, pVar));
        bVar.mo35641T1(new C39510b(aVar, bVar));
        bVar.mo63490f2(new C39512a(lVar, aVar));
        return bVar;
    }
}
