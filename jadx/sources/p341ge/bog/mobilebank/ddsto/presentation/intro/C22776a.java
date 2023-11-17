package p341ge.bog.mobilebank.ddsto.presentation.intro;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import ca0.C19670b;
import ca0.C19677i;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import java.util.Map;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p615tg.C17963d;
import p642vh.C18368l;
import s90.C28163a;
import ue1.C43075l;
import v90.C29005c;

/* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.a */
public final class C22776a extends C1819o {

    /* renamed from: f */
    private final C22777a f60074f;

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.a$a */
    public interface C22777a {
        /* renamed from: a */
        void mo56564a(C19677i iVar);
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.a$b */
    public static final class C22778b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C29005c f60075d;

        /* renamed from: e */
        private final C22777a f60076e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22778b(C29005c cVar, C22777a aVar) {
            super(cVar.mo3946b());
            C41536l.m120489i(cVar, "binding");
            C41536l.m120489i(aVar, "onPressListener");
            this.f60075d = cVar;
            this.f60076e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m73897j(C22778b bVar, C19677i iVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(iVar, "$item");
            bVar.f60076e.mo56564a(iVar);
        }

        /* renamed from: i */
        public final void mo56588i(C19677i iVar) {
            boolean z;
            boolean z2;
            String str;
            boolean z3;
            C19677i iVar2 = iVar;
            C41536l.m120489i(iVar2, "item");
            this.f60075d.f73962e.setOnClickListener(new C19670b(this, iVar2));
            this.f60075d.f73965h.setText(iVar.mo47878f());
            this.f60075d.f73965h.setTitle(iVar.mo47876e());
            SingleLineTextItem singleLineTextItem = this.f60075d.f73966i;
            String f = iVar.mo47878f();
            if (f == null) {
                f = iVar.mo47876e();
            }
            singleLineTextItem.setText(f);
            TwoLineReverseTextItem twoLineReverseTextItem = this.f60075d.f73965h;
            C41536l.m120488h(twoLineReverseTextItem, "binding.leftText");
            boolean z4 = true;
            if (iVar.mo47878f() == null || iVar.mo47876e() == null) {
                z = false;
            } else {
                z = true;
            }
            C32343x.m95483r1(twoLineReverseTextItem, z, false, 2, (Object) null);
            SingleLineTextItem singleLineTextItem2 = this.f60075d.f73966i;
            C41536l.m120488h(singleLineTextItem2, "binding.leftTextSingleLine");
            if (iVar.mo47878f() == null || iVar.mo47876e() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C32343x.m95483r1(singleLineTextItem2, z2, false, 2, (Object) null);
            Double a = iVar.mo47872a();
            if (a != null) {
                str = C32303f.m95200k(a.doubleValue(), iVar.mo47873b());
            } else {
                str = null;
            }
            this.f60075d.f73967j.setText(str);
            this.f60075d.f73968k.setText(str);
            this.f60075d.f73967j.setTitle(iVar.mo47879g());
            SingleLineTextItem singleLineTextItem3 = this.f60075d.f73968k;
            C41536l.m120488h(singleLineTextItem3, "binding.rightTextSingleLine");
            if (iVar.mo47879g() == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C32343x.m95483r1(singleLineTextItem3, z3, false, 2, (Object) null);
            TwoLineReverseTextItem twoLineReverseTextItem2 = this.f60075d.f73967j;
            C41536l.m120488h(twoLineReverseTextItem2, "binding.rightText");
            if (iVar.mo47879g() == null) {
                z4 = false;
            }
            C32343x.m95483r1(twoLineReverseTextItem2, z4, false, 2, (Object) null);
            if (iVar.mo47875d() != null) {
                ImageView imageView = this.f60075d.f73963f;
                C41536l.m120488h(imageView, "binding.image");
                C18368l.m62746A(imageView, new Image.Url(iVar.mo47875d(), new Image.Resource(C28163a.f71508d, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
                LayerView layerView = this.f60075d.f73964g;
                C41536l.m120488h(layerView, "binding.imageContainer");
                C32343x.m95447f1(layerView);
                return;
            }
            LayerView layerView2 = this.f60075d.f73964g;
            C41536l.m120488h(layerView2, "binding.imageContainer");
            C32343x.m95455i0(layerView2);
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.a$c */
    /* synthetic */ class C22779c implements C22777a, C41532h {

        /* renamed from: a */
        final /* synthetic */ C22777a f60077a;

        C22779c(C22777a aVar) {
            this.f60077a = aVar;
        }

        /* renamed from: a */
        public final void mo56564a(C19677i iVar) {
            C41536l.m120489i(iVar, "p0");
            this.f60077a.mo56564a(iVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C22777a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(1, this.f60077a, C22777a.class, "invoke", "invoke(Lge/bog/mobilebank/ddsto/presentation/intro/DdStoIntroUiModel;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22776a(C22777a aVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "onPressListener");
        this.f60074f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C22778b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo56588i((C19677i) g);
    }

    /* renamed from: l */
    public C22778b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C29005c d = C29005c.m88746d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C22778b(d, new C22779c(this.f60074f));
    }
}
