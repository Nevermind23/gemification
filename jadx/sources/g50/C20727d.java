package g50;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32290b1;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import ue1.C43064a;
import ue1.C43079p;

/* renamed from: g50.d */
public abstract class C20727d extends FrameLayout {

    /* renamed from: d */
    private final TextView f55900d;

    /* renamed from: e */
    private final TextView f55901e;

    /* renamed from: f */
    private final BogImageView f55902f;

    /* renamed from: g */
    private final View f55903g;

    /* renamed from: h */
    private final LinearLayout f55904h;

    /* renamed from: i */
    private boolean f55905i;

    /* renamed from: j */
    private boolean f55906j = true;

    /* renamed from: k */
    private C43079p f55907k;

    /* renamed from: g50.d$a */
    static final class C20728a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C20727d f55908d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20728a(C20727d dVar) {
            super(0);
            this.f55908d = dVar;
        }

        public final void invoke() {
            if (this.f55908d.mo49257e()) {
                this.f55908d.m67123f();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20727d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        View inflate = View.inflate(context, C10324m.layout_filter_item, this);
        View findViewById = inflate.findViewById(C10322k.f28757Jf);
        C41536l.m120488h(findViewById, "v.findViewById(R.id.header_title)");
        this.f55900d = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C10322k.bubbleTV);
        C41536l.m120488h(findViewById2, "v.findViewById(R.id.bubbleTV)");
        this.f55901e = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C10322k.arrowIV);
        C41536l.m120488h(findViewById3, "v.findViewById(R.id.arrowIV)");
        this.f55902f = (BogImageView) findViewById3;
        View findViewById4 = inflate.findViewById(C10322k.f28851jf);
        C41536l.m120488h(findViewById4, "v.findViewById(R.id.headerContainer)");
        this.f55903g = findViewById4;
        View findViewById5 = inflate.findViewById(C10322k.filter_content_container);
        C41536l.m120488h(findViewById5, "v.findViewById(R.id.filter_content_container)");
        LinearLayout linearLayout = (LinearLayout) findViewById5;
        this.f55904h = linearLayout;
        findViewById4.setOnClickListener(new C20726c(this));
        m67122d(attributeSet);
        if (this.f55905i) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m67120b(C20727d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo49258g();
    }

    /* renamed from: d */
    private final void m67122d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29326i3);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…styleable.FilterItemView)");
        String string = obtainStyledAttributes.getString(C10330s.f29356l3);
        this.f55905i = obtainStyledAttributes.getBoolean(C10330s.f29336j3, false);
        this.f55906j = obtainStyledAttributes.getBoolean(C10330s.f29346k3, true);
        obtainStyledAttributes.recycle();
        if (string == null) {
            string = "";
        }
        setTitle(string);
        if (!this.f55906j) {
            this.f55902f.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m67123f() {
        ViewParent viewParent;
        ViewParent parent = getParent();
        if (parent != null) {
            viewParent = parent.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof NestedScrollView) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(viewParent, "scrollY", new int[]{getTop()});
            ofInt.setDuration(300);
            ofInt.start();
        }
    }

    /* renamed from: e */
    public final boolean mo49257e() {
        return this.f55905i;
    }

    /* renamed from: g */
    public final void mo49258g() {
        boolean z;
        Animation animation;
        if (this.f55906j) {
            if (this.f55905i) {
                animation = C32290b1.m95113c(this.f55904h);
                C41536l.m120488h(animation, "collapse(contentLayout)");
                this.f55902f.animate().setDuration(animation.getDuration()).rotation(Utils.FLOAT_EPSILON);
                z = false;
            } else {
                animation = C32290b1.m95114d(this.f55904h);
                C41536l.m120488h(animation, "expand(contentLayout)");
                this.f55902f.animate().setDuration(animation.getDuration()).rotation(-180.0f);
                z = true;
            }
            this.f55905i = z;
            C32343x.m95435b1(animation, (C43064a) null, new C20728a(this), (C43064a) null, 5, (Object) null);
            C43079p pVar = this.f55907k;
            if (pVar != null) {
                pVar.invoke(this, Boolean.valueOf(this.f55905i));
            }
        }
    }

    public final LinearLayout getContentLayout() {
        return this.f55904h;
    }

    public final C43079p getToggleCallback() {
        return this.f55907k;
    }

    /* renamed from: h */
    public final void mo49261h(int i) {
        int i2;
        TextView textView = this.f55901e;
        if (i > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        this.f55901e.setText(String.valueOf(i));
    }

    public final void setTitle(String str) {
        C41536l.m120489i(str, "title");
        this.f55900d.setText(str);
    }

    public final void setToggleCallback(C43079p pVar) {
        this.f55907k = pVar;
    }
}
