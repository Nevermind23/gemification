package l61;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import c61.C31280e;
import com.airbnb.lottie.LottieAnimationView;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41549y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m61.C37229a;
import m61.C37230b;
import m61.C37231c;
import m61.C37232d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel;
import p341ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: l61.f */
public final class C37083f extends RecyclerView.C1736h {

    /* renamed from: d */
    private final C37230b f89251d;

    /* renamed from: e */
    private final C37230b f89252e;

    /* renamed from: f */
    private final C37229a f89253f;

    /* renamed from: g */
    private final C37231c f89254g;

    /* renamed from: h */
    private final C37231c f89255h;

    /* renamed from: i */
    private final C37232d f89256i;

    /* renamed from: j */
    private final List f89257j = new ArrayList();

    /* renamed from: l61.f$a */
    public static final class C37084a extends RecyclerView.C1734f0 {

        /* renamed from: f */
        public static final C37085a f89258f = new C37085a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final C31280e f89259d;

        /* renamed from: e */
        private C43064a f89260e;

        /* renamed from: l61.f$a$a */
        public static final class C37085a {
            private C37085a() {
            }

            public /* synthetic */ C37085a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: l61.f$a$b */
        static final class C37086b extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C37232d f89261d;

            /* renamed from: e */
            final /* synthetic */ StoryDetailsUiModel f89262e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37086b(C37232d dVar, StoryDetailsUiModel storyDetailsUiModel) {
                super(0);
                this.f89261d = dVar;
                this.f89262e = storyDetailsUiModel;
            }

            public final void invoke() {
                this.f89261d.mo85049a(this.f89262e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37084a(C31280e eVar) {
            super(eVar.mo3946b());
            C41536l.m120489i(eVar, "binding");
            this.f89259d = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final void m109623n(C37230b bVar, StoryDetailsUiModel storyDetailsUiModel, View view) {
            C41536l.m120489i(bVar, "$onPreviousTapped");
            C41536l.m120489i(storyDetailsUiModel, "$item");
            bVar.mo85036a(storyDetailsUiModel);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static final void m109624o(C37230b bVar, StoryDetailsUiModel storyDetailsUiModel, View view) {
            C41536l.m120489i(bVar, "$onNextTapped");
            C41536l.m120489i(storyDetailsUiModel, "$item");
            bVar.mo85036a(storyDetailsUiModel);
        }

        /* renamed from: p */
        private final View.OnTouchListener m109625p(StoryDetailsUiModel storyDetailsUiModel, C37231c cVar, C37231c cVar2) {
            return new C37080c(cVar, storyDetailsUiModel, new C41549y(), cVar2);
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static final boolean m109626q(C37231c cVar, StoryDetailsUiModel storyDetailsUiModel, C41549y yVar, C37231c cVar2, View view, MotionEvent motionEvent) {
            C41536l.m120489i(cVar, "$onStoryPaused");
            C41536l.m120489i(storyDetailsUiModel, "$item");
            C41536l.m120489i(yVar, "$startTime");
            C41536l.m120489i(cVar2, "$onStoryResumed");
            int action = motionEvent.getAction();
            if (action == 0) {
                cVar.mo85044a(storyDetailsUiModel);
                yVar.f97716d = System.currentTimeMillis();
                return false;
            } else if (action != 1) {
                return false;
            } else {
                cVar2.mo85044a(storyDetailsUiModel);
                if (System.currentTimeMillis() - yVar.f97716d >= 100) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: s */
        private final void m109627s(C37229a aVar, StoryDetailsUiModel storyDetailsUiModel) {
            String str;
            boolean z;
            int i;
            this.f89259d.f77671e.setOnClickListener(new C37081d(aVar, storyDetailsUiModel));
            this.f89259d.f77687u.setOnClickListener(new C37082e(aVar, storyDetailsUiModel));
            Button button = this.f89259d.f77671e;
            StringSource b = storyDetailsUiModel.mo85078b();
            boolean z2 = true;
            String str2 = null;
            if (b != null) {
                str = C34646b.m101752f(b, (Context) null, 1, (Object) null);
            } else {
                str = null;
            }
            button.setButtonText(str);
            AppCompatTextView appCompatTextView = this.f89259d.f77688v;
            StringSource b2 = storyDetailsUiModel.mo85078b();
            if (b2 != null) {
                str2 = C34646b.m101752f(b2, (Context) null, 1, (Object) null);
            }
            appCompatTextView.setText(str2);
            Button button2 = this.f89259d.f77671e;
            C41536l.m120488h(button2, "binding.actionButton");
            int i2 = 0;
            if (storyDetailsUiModel.mo85078b() == null || storyDetailsUiModel.mo85079d() == null || (storyDetailsUiModel.mo85079d() instanceof StoryContentLinkUiModel.Url)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            button2.setVisibility(i);
            LayerView layerView = this.f89259d.f77687u;
            C41536l.m120488h(layerView, "binding.urlButton");
            if (storyDetailsUiModel.mo85078b() == null || storyDetailsUiModel.mo85079d() == null || !(storyDetailsUiModel.mo85079d() instanceof StoryContentLinkUiModel.Url)) {
                z2 = false;
            }
            if (!z2) {
                i2 = 8;
            }
            layerView.setVisibility(i2);
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public static final void m109628t(C37229a aVar, StoryDetailsUiModel storyDetailsUiModel, View view) {
            C41536l.m120489i(aVar, "$onActionClicked");
            C41536l.m120489i(storyDetailsUiModel, "$item");
            aVar.mo85041a(storyDetailsUiModel);
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static final void m109629u(C37229a aVar, StoryDetailsUiModel storyDetailsUiModel, View view) {
            C41536l.m120489i(aVar, "$onActionClicked");
            C41536l.m120489i(storyDetailsUiModel, "$item");
            aVar.mo85041a(storyDetailsUiModel);
        }

        /* renamed from: m */
        public final void mo90019m(StoryDetailsUiModel storyDetailsUiModel, C37230b bVar, C37230b bVar2, C37229a aVar, C37231c cVar, C37231c cVar2, C37232d dVar) {
            String str;
            boolean z;
            int i;
            Spanned spanned;
            boolean z2;
            int i2;
            boolean z3;
            boolean z4;
            String f;
            C41536l.m120489i(storyDetailsUiModel, "item");
            C41536l.m120489i(bVar, "onNextTapped");
            C41536l.m120489i(bVar2, "onPreviousTapped");
            C41536l.m120489i(aVar, "onActionClicked");
            C41536l.m120489i(cVar, "onStoryPaused");
            C41536l.m120489i(cVar2, "onStoryResumed");
            C41536l.m120489i(dVar, "onStoryViewed");
            this.f89260e = null;
            m109627s(aVar, storyDetailsUiModel);
            StringSource k = storyDetailsUiModel.mo85089k();
            boolean z5 = true;
            if (k != null) {
                str = C34646b.m101752f(k, (Context) null, 1, (Object) null);
            } else {
                str = null;
            }
            this.f89259d.f77686t.setText(str);
            AppCompatTextView appCompatTextView = this.f89259d.f77686t;
            C41536l.m120488h(appCompatTextView, "binding.title");
            int i3 = 0;
            if (str == null || C40439w.m117118v(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = 0;
            } else {
                i = 8;
            }
            appCompatTextView.setVisibility(i);
            StringSource e = storyDetailsUiModel.mo85081e();
            if (e == null || (f = C34646b.m101752f(e, (Context) null, 1, (Object) null)) == null) {
                spanned = null;
            } else if (Build.VERSION.SDK_INT >= 24) {
                spanned = Html.fromHtml(f, 63);
            } else {
                spanned = Html.fromHtml(f);
            }
            this.f89259d.f77676j.setText(spanned);
            AppCompatTextView appCompatTextView2 = this.f89259d.f77676j;
            C41536l.m120488h(appCompatTextView2, "binding.description");
            if (spanned == null || !(!C40439w.m117118v(spanned))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            appCompatTextView2.setVisibility(i2);
            AppCompatImageView appCompatImageView = this.f89259d.f77684r;
            C41536l.m120488h(appCompatImageView, "binding.storyGradientDim");
            if (str == null || C40439w.m117118v(str)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (spanned == null || C40439w.m117118v(spanned)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (storyDetailsUiModel.mo85078b() == null || storyDetailsUiModel.mo85079d() == null)) {
                    z5 = false;
                }
            }
            if (!z5) {
                i3 = 8;
            }
            appCompatImageView.setVisibility(i3);
            LottieAnimationView lottieAnimationView = this.f89259d.f77672f;
            C41536l.m120488h(lottieAnimationView, "binding.backgroundImage");
            C18368l.m62746A(lottieAnimationView, storyDetailsUiModel.mo85077a(), (C43075l) null, 2, (Object) null);
            this.f89259d.f77683q.setOnClickListener(new C37078a(bVar2, storyDetailsUiModel));
            this.f89259d.f77682p.setOnClickListener(new C37079b(bVar, storyDetailsUiModel));
            this.f89259d.f77682p.setOnTouchListener(m109625p(storyDetailsUiModel, cVar, cVar2));
            this.f89259d.f77683q.setOnTouchListener(m109625p(storyDetailsUiModel, cVar, cVar2));
            this.f89260e = new C37086b(dVar, storyDetailsUiModel);
        }

        /* renamed from: r */
        public final void mo90020r() {
            C43064a aVar = this.f89260e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public C37083f(C37230b bVar, C37230b bVar2, C37229a aVar, C37231c cVar, C37231c cVar2, C37232d dVar) {
        C41536l.m120489i(bVar, "onNextClicked");
        C41536l.m120489i(bVar2, "onPreviousClicked");
        C41536l.m120489i(aVar, "onActionClicked");
        C41536l.m120489i(cVar, "onStoryPaused");
        C41536l.m120489i(cVar2, "onStoryResumed");
        C41536l.m120489i(dVar, "onStoryViewed");
        this.f89251d = bVar;
        this.f89252e = bVar2;
        this.f89253f = aVar;
        this.f89254g = cVar;
        this.f89255h = cVar2;
        this.f89256i = dVar;
    }

    /* renamed from: f */
    public void onBindViewHolder(C37084a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        StoryDetailsUiModel storyDetailsUiModel = (StoryDetailsUiModel) C41358y.m120010Z(this.f89257j, i);
        if (storyDetailsUiModel != null) {
            aVar.mo90019m(storyDetailsUiModel, this.f89251d, this.f89252e, this.f89253f, this.f89254g, this.f89255h, this.f89256i);
        }
    }

    /* renamed from: g */
    public C37084a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C31280e d = C31280e.m92911d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "it");
        return new C37084a(d);
    }

    public int getItemCount() {
        return this.f89257j.size();
    }

    /* renamed from: h */
    public void onViewAttachedToWindow(C37084a aVar) {
        C41536l.m120489i(aVar, "holder");
        super.onViewAttachedToWindow(aVar);
        aVar.mo90020r();
    }

    /* renamed from: i */
    public final void mo90018i(List list) {
        C41536l.m120489i(list, "list");
        C32343x.m95475p(this.f89257j, list);
        notifyDataSetChanged();
    }
}
