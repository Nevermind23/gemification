package n21;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b31.C31115d;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem;
import p615tg.C17963d;
import ue1.C43075l;
import ue1.C43080q;

/* renamed from: n21.c */
public final class C37346c extends C1819o {

    /* renamed from: f */
    private final C43075l f89795f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C43075l f89796g;

    /* renamed from: n21.c$a */
    public final class C37347a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C37346c f89797d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37347a(C37346c cVar, View view) {
            super(view);
            C41536l.m120489i(view, "view");
            this.f89797d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m110097k(CompoundButton compoundButton, boolean z, boolean z2) {
            C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m110098l(ChooserItem chooserItem, C37346c cVar, CompoundButton compoundButton, boolean z, boolean z2) {
            C41536l.m120489i(chooserItem, "$item");
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
            chooserItem.mo84289j(z);
            cVar.f89796g.invoke(chooserItem);
        }

        /* renamed from: j */
        public final void mo90431j(ChooserItem chooserItem) {
            C41536l.m120489i(chooserItem, "item");
            CheckboxView checkboxView = C31115d.m92578a(this.itemView).f77328e;
            C37346c cVar = this.f89797d;
            checkboxView.setText(chooserItem.mo84282e());
            checkboxView.setEnabled(chooserItem.mo84284f());
            checkboxView.setOnCheckedStateChangeListener(new C37344a());
            checkboxView.setChecked(chooserItem.mo84288i());
            checkboxView.setOnCheckedStateChangeListener(new C37345b(chooserItem, cVar));
        }
    }

    /* renamed from: n21.c$b */
    static final class C37348b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ChooserItem f89798d;

        /* renamed from: e */
        final /* synthetic */ C37346c f89799e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37348b(ChooserItem chooserItem, C37346c cVar) {
            super(1);
            this.f89798d = chooserItem;
            this.f89799e = cVar;
        }

        /* renamed from: a */
        public final void mo90432a(boolean z) {
            this.f89798d.mo84289j(z);
            C43075l k = this.f89799e.f89796g;
            ChooserItem chooserItem = this.f89798d;
            C41536l.m120488h(chooserItem, "item");
            k.invoke(chooserItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90432a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37346c(C43075l lVar, C43075l lVar2) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar2, "itemClickListener");
        this.f89795f = lVar;
        this.f89796g = lVar2;
    }

    /* renamed from: l */
    public void onBindViewHolder(C37347a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        ChooserItem chooserItem = (ChooserItem) mo6027g(i);
        if (this.f89795f != null) {
            C43080q d = chooserItem.mo84280d();
            if (d != null) {
                View view = aVar.itemView;
                C41536l.m120488h(view, "holder.itemView");
                C41536l.m120488h(chooserItem, "item");
                d.invoke(view, chooserItem, new C37348b(chooserItem, this));
                return;
            }
            return;
        }
        C41536l.m120488h(chooserItem, "item");
        aVar.mo90431j(chooserItem);
    }

    /* renamed from: m */
    public C37347a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (this.f89795f != null) {
            return new C37347a(this, (View) this.f89795f.invoke(viewGroup));
        }
        ConstraintLayout c = C31115d.m92579d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false).mo3946b();
        C41536l.m120488h(c, "inflate(\n               …se\n                ).root");
        return new C37347a(this, c);
    }
}
