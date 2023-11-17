package p321y3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import com.bumptech.glide.C2379b;
import java.nio.ByteBuffer;
import java.util.List;
import p089g4.C6223k;
import p153l3.C6874a;
import p166m3.C7092l;
import p321y3.C9051g;

/* renamed from: y3.c */
public class C9046c extends Drawable implements C9051g.C9053b, Animatable {

    /* renamed from: d */
    private final C9047a f25198d;

    /* renamed from: e */
    private boolean f25199e;

    /* renamed from: f */
    private boolean f25200f;

    /* renamed from: g */
    private boolean f25201g;

    /* renamed from: h */
    private boolean f25202h;

    /* renamed from: i */
    private int f25203i;

    /* renamed from: j */
    private int f25204j;

    /* renamed from: k */
    private boolean f25205k;

    /* renamed from: l */
    private Paint f25206l;

    /* renamed from: m */
    private Rect f25207m;

    /* renamed from: n */
    private List f25208n;

    /* renamed from: y3.c$a */
    static final class C9047a extends Drawable.ConstantState {

        /* renamed from: a */
        final C9051g f25209a;

        C9047a(C9051g gVar) {
            this.f25209a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C9046c(this);
        }
    }

    public C9046c(Context context, C6874a aVar, C7092l lVar, int i, int i2, Bitmap bitmap) {
        this(new C9047a(new C9051g(C2379b.m9204c(context), aVar, i, i2, lVar, bitmap)));
    }

    /* renamed from: b */
    private Drawable.Callback m33486b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m33487d() {
        if (this.f25207m == null) {
            this.f25207m = new Rect();
        }
        return this.f25207m;
    }

    /* renamed from: h */
    private Paint m33488h() {
        if (this.f25206l == null) {
            this.f25206l = new Paint(2);
        }
        return this.f25206l;
    }

    /* renamed from: j */
    private void m33489j() {
        List list = this.f25208n;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat$AnimationCallback) this.f25208n.get(i)).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: l */
    private void m33490l() {
        this.f25203i = 0;
    }

    /* renamed from: n */
    private void m33491n() {
        C6223k.m24727a(!this.f25201g, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f25198d.f25209a.mo24563f() == 1) {
            invalidateSelf();
        } else if (!this.f25199e) {
            this.f25199e = true;
            this.f25198d.f25209a.mo24569r(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    private void m33492o() {
        this.f25199e = false;
        this.f25198d.f25209a.mo24570s(this);
    }

    /* renamed from: a */
    public void mo24534a() {
        if (m33486b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo24539g() == mo24538f() - 1) {
            this.f25203i++;
        }
        int i = this.f25204j;
        if (i != -1 && this.f25203i >= i) {
            m33489j();
            stop();
        }
    }

    /* renamed from: c */
    public ByteBuffer mo24535c() {
        return this.f25198d.f25209a.mo24559b();
    }

    public void draw(Canvas canvas) {
        if (!this.f25201g) {
            if (this.f25205k) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m33487d());
                this.f25205k = false;
            }
            canvas.drawBitmap(this.f25198d.f25209a.mo24560c(), (Rect) null, m33487d(), m33488h());
        }
    }

    /* renamed from: e */
    public Bitmap mo24537e() {
        return this.f25198d.f25209a.mo24562e();
    }

    /* renamed from: f */
    public int mo24538f() {
        return this.f25198d.f25209a.mo24563f();
    }

    /* renamed from: g */
    public int mo24539g() {
        return this.f25198d.f25209a.mo24561d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f25198d;
    }

    public int getIntrinsicHeight() {
        return this.f25198d.f25209a.mo24564h();
    }

    public int getIntrinsicWidth() {
        return this.f25198d.f25209a.mo24566k();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int mo24544i() {
        return this.f25198d.f25209a.mo24565j();
    }

    public boolean isRunning() {
        return this.f25199e;
    }

    /* renamed from: k */
    public void mo24546k() {
        this.f25201g = true;
        this.f25198d.f25209a.mo24558a();
    }

    /* renamed from: m */
    public void mo24547m(C7092l lVar, Bitmap bitmap) {
        this.f25198d.f25209a.mo24568o(lVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f25205k = true;
    }

    public void setAlpha(int i) {
        m33488h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m33488h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C6223k.m24727a(!this.f25201g, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f25202h = z;
        if (!z) {
            m33492o();
        } else if (this.f25200f) {
            m33491n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f25200f = true;
        m33490l();
        if (this.f25202h) {
            m33491n();
        }
    }

    public void stop() {
        this.f25200f = false;
        m33492o();
    }

    C9046c(C9047a aVar) {
        this.f25202h = true;
        this.f25204j = -1;
        this.f25198d = (C9047a) C6223k.m24730d(aVar);
    }
}
