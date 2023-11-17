package p058e;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0436h1;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.C0820l;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.C1880f;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p058e.C5871b;
import p058e.C5878e;
import p071f.C6128b;
import p071f.C6129c;
import p071f.C6131e;

/* renamed from: e.a */
public class C5863a extends C5878e {

    /* renamed from: r */
    private C5866c f18389r;

    /* renamed from: s */
    private C5870g f18390s;

    /* renamed from: t */
    private int f18391t;

    /* renamed from: u */
    private int f18392u;

    /* renamed from: v */
    private boolean f18393v;

    /* renamed from: e.a$b */
    private static class C5865b extends C5870g {

        /* renamed from: a */
        private final Animatable f18394a;

        C5865b(Animatable animatable) {
            super();
            this.f18394a = animatable;
        }

        /* renamed from: c */
        public void mo19098c() {
            this.f18394a.start();
        }

        /* renamed from: d */
        public void mo19099d() {
            this.f18394a.stop();
        }
    }

    /* renamed from: e.a$c */
    static class C5866c extends C5878e.C5879a {

        /* renamed from: K */
        LongSparseArray f18395K;

        /* renamed from: L */
        SparseArrayCompat f18396L;

        C5866c(C5866c cVar, C5863a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f18395K = cVar.f18395K;
                this.f18396L = cVar.f18396L;
                return;
            }
            this.f18395K = new LongSparseArray();
            this.f18396L = new SparseArrayCompat();
        }

        /* renamed from: D */
        private static long m23583D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public int mo19100B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo19222z(iArr, drawable);
            this.f18396L.put(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public int mo19101C(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int a = super.mo19156a(drawable);
            long D = m23583D(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = (long) a;
            this.f18395K.append(D, Long.valueOf(j2 | j));
            if (z) {
                this.f18395K.append(m23583D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo19102E(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f18396L.get(i, 0)).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo19103F(int[] iArr) {
            int A = super.mo19221A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.mo19221A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public int mo19104G(int i, int i2) {
            return (int) ((Long) this.f18395K.get(m23583D(i, i2), -1L)).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public boolean mo19105H(int i, int i2) {
            if ((((Long) this.f18395K.get(m23583D(i, i2), -1L)).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo19106I(int i, int i2) {
            if ((((Long) this.f18395K.get(m23583D(i, i2), -1L)).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        public Drawable newDrawable() {
            return new C5863a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo19109r() {
            this.f18395K = this.f18395K.clone();
            this.f18396L = this.f18396L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new C5863a(this, resources);
        }
    }

    /* renamed from: e.a$d */
    private static class C5867d extends C5870g {

        /* renamed from: a */
        private final AnimatedVectorDrawableCompat f18397a;

        C5867d(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.f18397a = animatedVectorDrawableCompat;
        }

        /* renamed from: c */
        public void mo19098c() {
            this.f18397a.start();
        }

        /* renamed from: d */
        public void mo19099d() {
            this.f18397a.stop();
        }
    }

    /* renamed from: e.a$e */
    private static class C5868e extends C5870g {

        /* renamed from: a */
        private final ObjectAnimator f18398a;

        /* renamed from: b */
        private final boolean f18399b;

        C5868e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int i;
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C5869f fVar = new C5869f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            C6128b.m24504a(ofInt, true);
            ofInt.setDuration((long) fVar.mo19112a());
            ofInt.setInterpolator(fVar);
            this.f18399b = z2;
            this.f18398a = ofInt;
        }

        /* renamed from: a */
        public boolean mo19110a() {
            return this.f18399b;
        }

        /* renamed from: b */
        public void mo19111b() {
            this.f18398a.reverse();
        }

        /* renamed from: c */
        public void mo19098c() {
            this.f18398a.start();
        }

        /* renamed from: d */
        public void mo19099d() {
            this.f18398a.cancel();
        }
    }

    /* renamed from: e.a$f */
    private static class C5869f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f18400a;

        /* renamed from: b */
        private int f18401b;

        /* renamed from: c */
        private int f18402c;

        C5869f(AnimationDrawable animationDrawable, boolean z) {
            mo19113b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo19112a() {
            return this.f18402c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo19113b(AnimationDrawable animationDrawable, boolean z) {
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f18401b = numberOfFrames;
            int[] iArr = this.f18400a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f18400a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f18400a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                if (z) {
                    i = (numberOfFrames - i3) - 1;
                } else {
                    i = i3;
                }
                int duration = animationDrawable.getDuration(i);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f18402c = i2;
            return i2;
        }

        public float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * ((float) this.f18402c)) + 0.5f);
            int i2 = this.f18401b;
            int[] iArr = this.f18400a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            if (i3 < i2) {
                f2 = ((float) i) / ((float) this.f18402c);
            } else {
                f2 = Utils.FLOAT_EPSILON;
            }
            return (((float) i3) / ((float) i2)) + f2;
        }
    }

    /* renamed from: e.a$g */
    private static abstract class C5870g {
        private C5870g() {
        }

        /* renamed from: a */
        public boolean mo19110a() {
            return false;
        }

        /* renamed from: b */
        public void mo19111b() {
        }

        /* renamed from: c */
        public abstract void mo19098c();

        /* renamed from: d */
        public abstract void mo19099d();
    }

    public C5863a() {
        this((C5866c) null, (Resources) null);
    }

    /* renamed from: l */
    public static C5863a m23570l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C5863a aVar = new C5863a();
            aVar.mo19094m(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: n */
    private void m23571n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m23573p(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m23574q(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    private void m23572o() {
        onStateChange(getState());
    }

    /* renamed from: p */
    private int m23573p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray s = C0820l.m3076s(resources, theme, attributeSet, C6131e.f19075h);
        int resourceId = s.getResourceId(C6131e.f19076i, 0);
        int resourceId2 = s.getResourceId(C6131e.f19077j, -1);
        if (resourceId2 > 0) {
            drawable = C0436h1.m1738h().mo2111j(context, resourceId2);
        } else {
            drawable = null;
        }
        s.recycle();
        int[] j = mo19220j(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = C1880f.m7333c(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = C6129c.m24505a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            return this.f18389r.mo19100B(j, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: q */
    private int m23574q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray s = C0820l.m3076s(resources, theme, attributeSet, C6131e.f19078k);
        int resourceId = s.getResourceId(C6131e.f19081n, -1);
        int resourceId2 = s.getResourceId(C6131e.f19080m, -1);
        int resourceId3 = s.getResourceId(C6131e.f19079l, -1);
        if (resourceId3 > 0) {
            drawable = C0436h1.m1738h().mo2111j(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = s.getBoolean(C6131e.f19082o, false);
        s.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = AnimatedVectorDrawableCompat.m7300c(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = C6129c.m24505a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f18389r.mo19101C(resourceId, resourceId2, drawable, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: r */
    private boolean m23575r(int i) {
        int i2;
        int G;
        C5870g gVar;
        C5870g gVar2 = this.f18390s;
        if (gVar2 == null) {
            i2 = mo19117c();
        } else if (i == this.f18391t) {
            return true;
        } else {
            if (i != this.f18392u || !gVar2.mo19110a()) {
                i2 = this.f18391t;
                gVar2.mo19099d();
            } else {
                gVar2.mo19111b();
                this.f18391t = this.f18392u;
                this.f18392u = i;
                return true;
            }
        }
        this.f18390s = null;
        this.f18392u = -1;
        this.f18391t = -1;
        C5866c cVar = this.f18389r;
        int E = cVar.mo19102E(i2);
        int E2 = cVar.mo19102E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo19104G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo19106I(E, E2);
        mo19120g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C5868e((AnimationDrawable) current, cVar.mo19105H(E, E2), I);
        } else if (current instanceof AnimatedVectorDrawableCompat) {
            gVar = new C5867d((AnimatedVectorDrawableCompat) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C5865b((Animatable) current);
            }
            return false;
        }
        gVar.mo19098c();
        this.f18390s = gVar;
        this.f18392u = i2;
        this.f18391t = i;
        return true;
    }

    /* renamed from: s */
    private void m23576s(TypedArray typedArray) {
        C5866c cVar = this.f18389r;
        cVar.f18429d |= C6129c.m24506b(typedArray);
        cVar.mo19178x(typedArray.getBoolean(C6131e.f19071d, cVar.f18434i));
        cVar.mo19174t(typedArray.getBoolean(C6131e.f19072e, cVar.f18437l));
        cVar.mo19175u(typedArray.getInt(C6131e.f19073f, cVar.f18417A));
        cVar.mo19176v(typedArray.getInt(C6131e.f19074g, cVar.f18418B));
        setDither(typedArray.getBoolean(C6131e.f19069b, cVar.f18449x));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo19090h(C5871b.C5875d dVar) {
        super.mo19090h(dVar);
        if (dVar instanceof C5866c) {
            this.f18389r = (C5866c) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C5870g gVar = this.f18390s;
        if (gVar != null) {
            gVar.mo19099d();
            this.f18390s = null;
            mo19120g(this.f18391t);
            this.f18391t = -1;
            this.f18392u = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C5866c mo19089b() {
        return new C5866c(this.f18389r, this, (Resources) null);
    }

    /* renamed from: m */
    public void mo19094m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray s = C0820l.m3076s(resources, theme, attributeSet, C6131e.f19068a);
        setVisible(s.getBoolean(C6131e.f19070c, true), true);
        m23576s(s);
        mo19133i(resources);
        s.recycle();
        m23571n(context, resources, xmlPullParser, attributeSet, theme);
        m23572o();
    }

    public Drawable mutate() {
        if (!this.f18393v && super.mutate() == this) {
            this.f18389r.mo19109r();
            this.f18393v = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int F = this.f18389r.mo19103F(iArr);
        if (F == mo19117c() || (!m23575r(F) && !mo19120g(F))) {
            z = false;
        } else {
            z = true;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z | current.setState(iArr);
        }
        return z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C5870g gVar = this.f18390s;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo19098c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C5863a(C5866c cVar, Resources resources) {
        super((C5878e.C5879a) null);
        this.f18391t = -1;
        this.f18392u = -1;
        mo19090h(new C5866c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
