package u31;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import b31.C31124m;
import g91.C32289b0;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import o31.C37626z;
import p086g1.C6201a;
import ue1.C43075l;
import x11.C39770c;
import y31.C40019a;

/* renamed from: u31.b */
public final class C39010b extends C1819o {

    /* renamed from: f */
    private final C43075l f93131f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39010b(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onContactClickListener");
        this.f93131f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m113910m(C39010b bVar, C40019a aVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C43075l lVar = bVar.f93131f;
        C41536l.m120488h(aVar, "item");
        lVar.invoke(aVar);
    }

    /* renamed from: l */
    public void onBindViewHolder(C37626z zVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C41536l.m120489i(zVar, "holder");
        C40019a aVar = (C40019a) mo6027g(i);
        C6201a h = zVar.mo90806h();
        if (h instanceof C31124m) {
            C31124m mVar = (C31124m) h;
            mVar.f77355f.setTitle(aVar.mo93839a());
            mVar.f77355f.setText(aVar.mo93841c());
            ImageView imageView = mVar.f77354e;
            C41536l.m120488h(imageView, "binding.avatar");
            if (aVar.mo93842d().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(imageView, z, false, 2, (Object) null);
            TextView textView = mVar.f77356g;
            C41536l.m120488h(textView, "binding.inizials");
            if (aVar.mo93842d().length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C32343x.m95483r1(textView, z2, false, 2, (Object) null);
            StringBuilder sb = new StringBuilder();
            for (String str : C40440x.m117182x0(aVar.mo93839a(), new String[]{" "}, false, 0, 6, (Object) null)) {
                if (str.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    sb.append(C40445z.m117191V0(str));
                }
                sb.length();
            }
            mVar.f77356g.setText(sb.toString());
            C32289b0.m95098j(mVar.f77354e, Uri.parse(aVar.mo93842d()), Integer.valueOf(C39770c.f94466c), (Integer) null, true);
            mVar.mo3946b().setOnClickListener(new C39009a(this, aVar));
        }
    }

    /* renamed from: n */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        return new C37626z(C31124m.m92616d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
