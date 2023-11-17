package p621tm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel;
import p481jm.C16240s;
import p615tg.C17963d;

/* renamed from: tm.b */
public final class C17992b extends C1819o {

    /* renamed from: f */
    private final C18007i f51214f;

    /* renamed from: tm.b$a */
    public static final class C17993a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16240s f51215d;

        /* renamed from: e */
        private final C18007i f51216e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17993a(C16240s sVar, C18007i iVar) {
            super(sVar.mo3946b());
            C41536l.m120489i(sVar, "binding");
            C41536l.m120489i(iVar, "onAddressClicked");
            this.f51215d = sVar;
            this.f51216e = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m61972j(C17993a aVar, AddressAdapterModel addressAdapterModel, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(addressAdapterModel, "$item");
            aVar.f51216e.mo39039a(addressAdapterModel);
        }

        /* renamed from: i */
        public final void mo45685i(AddressAdapterModel addressAdapterModel) {
            C41536l.m120489i(addressAdapterModel, "item");
            this.f51215d.mo3946b().setOnClickListener(new C17991a(this, addressAdapterModel));
            this.f51215d.f45985e.setImageResource(addressAdapterModel.mo39271b());
            this.f51215d.f45986f.setText(addressAdapterModel.mo39276f());
            AppCompatImageView appCompatImageView = this.f51215d.f45987g;
            C41536l.m120488h(appCompatImageView, "binding.chevronImage");
            C32343x.m95483r1(appCompatImageView, addressAdapterModel.mo39270a(), false, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17992b(C18007i iVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(iVar, "onAddressClicked");
        this.f51214f = iVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C17993a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo45685i((AddressAdapterModel) g);
    }

    /* renamed from: l */
    public C17993a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16240s d = C16240s.m57896d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C17993a(d, this.f51214f);
    }
}
