package o30;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import g91.C32289b0;
import g91.C32343x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import o30.C26716f;
import p366bk.C10322k;

/* renamed from: o30.a */
public class C26710a extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final View f67326d;

    /* renamed from: e */
    private final ImageView f67327e;

    /* renamed from: f */
    private final View f67328f;

    /* renamed from: g */
    private final TextView f67329g;

    /* renamed from: h */
    private final TextView f67330h;

    /* renamed from: i */
    private final ImageView f67331i;

    /* renamed from: j */
    private final Drawable f67332j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26710a(View view) {
        super(view);
        Drawable drawable;
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.rounded_container);
        this.f67326d = findViewById;
        this.f67327e = (ImageView) view.findViewById(C10322k.f28789Sg);
        this.f67328f = view.findViewById(C10322k.f28836g2);
        this.f67329g = (TextView) view.findViewById(C10322k.badge_text);
        this.f67330h = (TextView) view.findViewById(C10322k.f28903v4);
        this.f67331i = (ImageView) view.findViewById(C10322k.new_notification_badge);
        if (findViewById != null) {
            drawable = findViewById.getBackground();
        } else {
            drawable = null;
        }
        this.f67332j = drawable;
    }

    /* renamed from: h */
    private final Drawable m83140h(C26716f fVar) {
        if (C41536l.m120484d(fVar, C26716f.C26717a.f67351a)) {
            return null;
        }
        if (C41536l.m120484d(fVar, C26716f.C26718b.f67352a)) {
            return this.f67332j;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: k */
    private final String m83141k(int i) {
        if (i > 9) {
            return "9+";
        }
        return String.valueOf(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final ImageView mo65919i() {
        return this.f67327e;
    }

    /* renamed from: j */
    public void mo65920j(C26720h hVar) {
        String str;
        boolean z;
        C41536l.m120489i(hVar, "item");
        ImageView imageView = this.f67327e;
        if (imageView != null) {
            C2379b.m9210t(imageView.getContext()).mo7742m(this.f67327e);
            this.f67327e.setImageDrawable((Drawable) null);
            if (hVar.mo65927f() != null) {
                C32289b0.m95107s(this.f67327e, hVar.mo65927f(), hVar.mo65929h(), hVar.mo65929h(), true, false);
            } else if (hVar.mo65929h() != null) {
                ImageView imageView2 = this.f67327e;
                Integer h = hVar.mo65929h();
                C41536l.m120486f(h);
                imageView2.setImageResource(h.intValue());
            } else {
                this.f67327e.setImageDrawable((Drawable) null);
            }
        }
        this.f67330h.setMaxLines(hVar.mo65928g());
        TextView textView = this.f67330h;
        if (hVar.mo65930i() != null) {
            Context context = this.itemView.getContext();
            if (context != null) {
                Integer i = hVar.mo65930i();
                C41536l.m120486f(i);
                str = context.getString(i.intValue());
            } else {
                str = null;
            }
        } else {
            str = hVar.mo65923b();
        }
        textView.setText(str);
        ImageView imageView3 = this.f67331i;
        boolean z2 = true;
        if (imageView3 != null) {
            if (hVar.mo65933l() != null) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(imageView3, z, false, 2, (Object) null);
        }
        Integer l = hVar.mo65933l();
        if (l != null) {
            int intValue = l.intValue();
            ImageView imageView4 = this.f67331i;
            if (imageView4 != null) {
                imageView4.setImageResource(intValue);
            }
        }
        View view = this.f67328f;
        if (view != null) {
            C32343x.m95483r1(view, hVar.mo65931j(), false, 2, (Object) null);
        }
        TextView textView2 = this.f67329g;
        if (textView2 != null) {
            if (hVar.mo65932k() <= 0) {
                z2 = false;
            }
            C32343x.m95483r1(textView2, z2, false, 2, (Object) null);
        }
        TextView textView3 = this.f67329g;
        if (textView3 != null) {
            textView3.setText(m83141k(hVar.mo65932k()));
        }
        View view2 = this.f67326d;
        if (view2 != null) {
            view2.setBackground(m83140h(hVar.mo65924c()));
        }
    }
}
