package com.theartofdev.edmodo.cropper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.github.mikephil.charting.utils.Utils;
import com.theartofdev.edmodo.cropper.C11861a;
import com.theartofdev.edmodo.cropper.C11863b;
import com.theartofdev.edmodo.cropper.CropOverlayView;
import java.lang.ref.WeakReference;
import java.util.UUID;

public class CropImageView extends FrameLayout {

    /* renamed from: A */
    private C11851e f34499A;

    /* renamed from: B */
    private Uri f34500B;

    /* renamed from: C */
    private int f34501C = 1;

    /* renamed from: D */
    private float f34502D = 1.0f;

    /* renamed from: E */
    private float f34503E;

    /* renamed from: F */
    private float f34504F;

    /* renamed from: G */
    private RectF f34505G;

    /* renamed from: H */
    private int f34506H;

    /* renamed from: I */
    private boolean f34507I;

    /* renamed from: J */
    private Uri f34508J;

    /* renamed from: K */
    private WeakReference f34509K;

    /* renamed from: L */
    private WeakReference f34510L;

    /* renamed from: d */
    private final ImageView f34511d;

    /* renamed from: e */
    private final CropOverlayView f34512e;

    /* renamed from: f */
    private final Matrix f34513f = new Matrix();

    /* renamed from: g */
    private final Matrix f34514g = new Matrix();

    /* renamed from: h */
    private final ProgressBar f34515h;

    /* renamed from: i */
    private final float[] f34516i = new float[8];

    /* renamed from: j */
    private final float[] f34517j = new float[8];

    /* renamed from: k */
    private C11868d f34518k;

    /* renamed from: l */
    private Bitmap f34519l;

    /* renamed from: m */
    private int f34520m;

    /* renamed from: n */
    private int f34521n;

    /* renamed from: o */
    private boolean f34522o;

    /* renamed from: p */
    private boolean f34523p;

    /* renamed from: q */
    private int f34524q;

    /* renamed from: r */
    private int f34525r;

    /* renamed from: s */
    private int f34526s;

    /* renamed from: t */
    private C11857k f34527t;

    /* renamed from: u */
    private boolean f34528u = false;

    /* renamed from: v */
    private boolean f34529v = true;

    /* renamed from: w */
    private boolean f34530w = true;

    /* renamed from: x */
    private boolean f34531x = true;

    /* renamed from: y */
    private int f34532y;

    /* renamed from: z */
    private C11855i f34533z;

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$a */
    class C11847a implements CropOverlayView.C11859b {
        C11847a() {
        }

        /* renamed from: a */
        public void mo31821a(boolean z) {
            CropImageView.this.m43391l(z, true);
            C11853g unused = CropImageView.this.getClass();
            C11852f unused2 = CropImageView.this.getClass();
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$b */
    public static class C11848b {

        /* renamed from: d */
        private final Bitmap f34535d;

        /* renamed from: e */
        private final Uri f34536e;

        /* renamed from: f */
        private final Bitmap f34537f;

        /* renamed from: g */
        private final Uri f34538g;

        /* renamed from: h */
        private final Exception f34539h;

        /* renamed from: i */
        private final float[] f34540i;

        /* renamed from: j */
        private final Rect f34541j;

        /* renamed from: k */
        private final Rect f34542k;

        /* renamed from: l */
        private final int f34543l;

        /* renamed from: m */
        private final int f34544m;

        C11848b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            this.f34535d = bitmap;
            this.f34536e = uri;
            this.f34537f = bitmap2;
            this.f34538g = uri2;
            this.f34539h = exc;
            this.f34540i = fArr;
            this.f34541j = rect;
            this.f34542k = rect2;
            this.f34543l = i;
            this.f34544m = i2;
        }

        /* renamed from: a */
        public float[] mo31822a() {
            return this.f34540i;
        }

        /* renamed from: b */
        public Rect mo31823b() {
            return this.f34541j;
        }

        /* renamed from: d */
        public Exception mo31824d() {
            return this.f34539h;
        }

        /* renamed from: e */
        public Uri mo31825e() {
            return this.f34536e;
        }

        /* renamed from: f */
        public int mo31826f() {
            return this.f34543l;
        }

        /* renamed from: g */
        public int mo31827g() {
            return this.f34544m;
        }

        /* renamed from: h */
        public Uri mo31828h() {
            return this.f34538g;
        }

        /* renamed from: i */
        public Rect mo31829i() {
            return this.f34542k;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$c */
    public enum C11849c {
        RECTANGLE,
        OVAL
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$d */
    public enum C11850d {
        OFF,
        ON_TOUCH,
        ON
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$e */
    public interface C11851e {
        /* renamed from: t */
        void mo31759t(CropImageView cropImageView, C11848b bVar);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$f */
    public interface C11852f {
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$g */
    public interface C11853g {
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$h */
    public interface C11854h {
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$i */
    public interface C11855i {
        /* renamed from: i0 */
        void mo31756i0(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$j */
    public enum C11856j {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageView$k */
    public enum C11857k {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CropImageView(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.f34513f = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r7.f34514g = r0
            r0 = 8
            float[] r1 = new float[r0]
            r7.f34516i = r1
            float[] r0 = new float[r0]
            r7.f34517j = r0
            r0 = 0
            r7.f34528u = r0
            r1 = 1
            r7.f34529v = r1
            r7.f34530w = r1
            r7.f34531x = r1
            r7.f34501C = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r7.f34502D = r2
            boolean r2 = r8 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L_0x0038
            r2 = r8
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r2 = r2.getIntent()
            goto L_0x0039
        L_0x0038:
            r2 = r3
        L_0x0039:
            if (r2 == 0) goto L_0x004c
            java.lang.String r4 = "CROP_IMAGE_EXTRA_BUNDLE"
            android.os.Bundle r2 = r2.getBundleExtra(r4)
            if (r2 == 0) goto L_0x004c
            java.lang.String r3 = "CROP_IMAGE_EXTRA_OPTIONS"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            r3 = r2
            com.theartofdev.edmodo.cropper.CropImageOptions r3 = (com.theartofdev.edmodo.cropper.CropImageOptions) r3
        L_0x004c:
            if (r3 != 0) goto L_0x01e8
            com.theartofdev.edmodo.cropper.CropImageOptions r3 = new com.theartofdev.edmodo.cropper.CropImageOptions
            r3.<init>()
            if (r9 == 0) goto L_0x01e8
            int[] r2 = p571qe.C17495f.f49005u
            android.content.res.TypedArray r9 = r8.obtainStyledAttributes(r9, r2, r0, r0)
            int r0 = p571qe.C17495f.f48944F     // Catch:{ all -> 0x01e3 }
            boolean r2 = r3.f34487o     // Catch:{ all -> 0x01e3 }
            boolean r2 = r9.getBoolean(r0, r2)     // Catch:{ all -> 0x01e3 }
            r3.f34487o = r2     // Catch:{ all -> 0x01e3 }
            int r2 = p571qe.C17495f.f49007v     // Catch:{ all -> 0x01e3 }
            int r4 = r3.f34488p     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r2, r4)     // Catch:{ all -> 0x01e3 }
            r3.f34488p = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f49009w     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f34489q     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34489q = r4     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$k[] r4 = com.theartofdev.edmodo.cropper.CropImageView.C11857k.values()     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f48959U     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$k r6 = r3.f34480h     // Catch:{ all -> 0x01e3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInt(r5, r6)     // Catch:{ all -> 0x01e3 }
            r4 = r4[r5]     // Catch:{ all -> 0x01e3 }
            r3.f34480h = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f49011x     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.f34483k     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34483k = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48957S     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.f34484l     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34484l = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48952N     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f34485m     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34485m = r4     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$c[] r4 = com.theartofdev.edmodo.cropper.CropImageView.C11849c.values()     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f48960V     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$c r6 = r3.f34476d     // Catch:{ all -> 0x01e3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInt(r5, r6)     // Catch:{ all -> 0x01e3 }
            r4 = r4[r5]     // Catch:{ all -> 0x01e3 }
            r3.f34476d = r4     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$d[] r4 = com.theartofdev.edmodo.cropper.CropImageView.C11850d.values()     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f48946H     // Catch:{ all -> 0x01e3 }
            com.theartofdev.edmodo.cropper.CropImageView$d r6 = r3.f34479g     // Catch:{ all -> 0x01e3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInt(r5, r6)     // Catch:{ all -> 0x01e3 }
            r4 = r4[r5]     // Catch:{ all -> 0x01e3 }
            r3.f34479g = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48963Y     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f34477e     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34477e = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48964Z     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f34478f     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34478f = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48949K     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f34486n     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34486n = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48943E     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f34490r     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34490r = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48942D     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f34491s     // Catch:{ all -> 0x01e3 }
            int r4 = r9.getInteger(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34491s = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48941C     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f34492t     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34492t = r5     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f48940B     // Catch:{ all -> 0x01e3 }
            float r6 = r3.f34493u     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f34493u = r5     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f48939A     // Catch:{ all -> 0x01e3 }
            float r6 = r3.f34494v     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f34494v = r5     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f49014z     // Catch:{ all -> 0x01e3 }
            int r6 = r3.f34495w     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInteger(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f34495w = r5     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f48948J     // Catch:{ all -> 0x01e3 }
            float r6 = r3.f34496x     // Catch:{ all -> 0x01e3 }
            float r5 = r9.getDimension(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f34496x = r5     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f48947I     // Catch:{ all -> 0x01e3 }
            int r6 = r3.f34497y     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInteger(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f34497y = r5     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f49013y     // Catch:{ all -> 0x01e3 }
            int r6 = r3.f34498z     // Catch:{ all -> 0x01e3 }
            int r5 = r9.getInteger(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f34498z = r5     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f48961W     // Catch:{ all -> 0x01e3 }
            boolean r6 = r7.f34529v     // Catch:{ all -> 0x01e3 }
            boolean r5 = r9.getBoolean(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f34481i = r5     // Catch:{ all -> 0x01e3 }
            int r5 = p571qe.C17495f.f48962X     // Catch:{ all -> 0x01e3 }
            boolean r6 = r7.f34530w     // Catch:{ all -> 0x01e3 }
            boolean r5 = r9.getBoolean(r5, r6)     // Catch:{ all -> 0x01e3 }
            r3.f34482j = r5     // Catch:{ all -> 0x01e3 }
            float r5 = r3.f34492t     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34492t = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48956R     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f34451A     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f34451A = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48955Q     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f34452B     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getDimension(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f34452B = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48954P     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f34453C     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f34453C = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48953O     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f34454D     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f34454D = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48951M     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f34455E     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f34455E = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48950L     // Catch:{ all -> 0x01e3 }
            int r5 = r3.f34456F     // Catch:{ all -> 0x01e3 }
            float r5 = (float) r5     // Catch:{ all -> 0x01e3 }
            float r4 = r9.getFloat(r4, r5)     // Catch:{ all -> 0x01e3 }
            int r4 = (int) r4     // Catch:{ all -> 0x01e3 }
            r3.f34456F = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48945G     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.f34472V     // Catch:{ all -> 0x01e3 }
            boolean r5 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34472V = r5     // Catch:{ all -> 0x01e3 }
            boolean r5 = r3.f34473W     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r3.f34473W = r4     // Catch:{ all -> 0x01e3 }
            int r4 = p571qe.C17495f.f48958T     // Catch:{ all -> 0x01e3 }
            boolean r5 = r7.f34528u     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.getBoolean(r4, r5)     // Catch:{ all -> 0x01e3 }
            r7.f34528u = r4     // Catch:{ all -> 0x01e3 }
            boolean r4 = r9.hasValue(r2)     // Catch:{ all -> 0x01e3 }
            if (r4 == 0) goto L_0x01df
            boolean r2 = r9.hasValue(r2)     // Catch:{ all -> 0x01e3 }
            if (r2 == 0) goto L_0x01df
            boolean r0 = r9.hasValue(r0)     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x01df
            r3.f34487o = r1     // Catch:{ all -> 0x01e3 }
        L_0x01df:
            r9.recycle()
            goto L_0x01e8
        L_0x01e3:
            r8 = move-exception
            r9.recycle()
            throw r8
        L_0x01e8:
            r3.mo31760a()
            com.theartofdev.edmodo.cropper.CropImageView$k r9 = r3.f34480h
            r7.f34527t = r9
            boolean r9 = r3.f34483k
            r7.f34531x = r9
            int r9 = r3.f34485m
            r7.f34532y = r9
            boolean r9 = r3.f34481i
            r7.f34529v = r9
            boolean r9 = r3.f34482j
            r7.f34530w = r9
            boolean r9 = r3.f34472V
            r7.f34522o = r9
            boolean r9 = r3.f34473W
            r7.f34523p = r9
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r9 = p571qe.C17492c.crop_image_view
            android.view.View r8 = r8.inflate(r9, r7, r1)
            int r9 = p571qe.C17491b.ImageView_image
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r7.f34511d = r9
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r9.setScaleType(r0)
            int r9 = p571qe.C17491b.CropOverlayView
            android.view.View r9 = r8.findViewById(r9)
            com.theartofdev.edmodo.cropper.CropOverlayView r9 = (com.theartofdev.edmodo.cropper.CropOverlayView) r9
            r7.f34512e = r9
            com.theartofdev.edmodo.cropper.CropImageView$a r0 = new com.theartofdev.edmodo.cropper.CropImageView$a
            r0.<init>()
            r9.setCropWindowChangeListener(r0)
            r9.setInitialAttributeValues(r3)
            int r9 = p571qe.C17491b.CropProgressBar
            android.view.View r8 = r8.findViewById(r9)
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            r7.f34515h = r8
            r7.m43395v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: d */
    private void m43388d(float f, float f2, boolean z, boolean z2) {
        float f3;
        float f4;
        float f5;
        if (this.f34519l != null) {
            float f6 = Utils.FLOAT_EPSILON;
            if (f > Utils.FLOAT_EPSILON && f2 > Utils.FLOAT_EPSILON) {
                this.f34513f.invert(this.f34514g);
                RectF cropWindowRect = this.f34512e.getCropWindowRect();
                this.f34514g.mapRect(cropWindowRect);
                this.f34513f.reset();
                this.f34513f.postTranslate((f - ((float) this.f34519l.getWidth())) / 2.0f, (f2 - ((float) this.f34519l.getHeight())) / 2.0f);
                m43392m();
                int i = this.f34521n;
                if (i > 0) {
                    this.f34513f.postRotate((float) i, C11865c.m43467q(this.f34516i), C11865c.m43468r(this.f34516i));
                    m43392m();
                }
                float min = Math.min(f / C11865c.m43474x(this.f34516i), f2 / C11865c.m43470t(this.f34516i));
                C11857k kVar = this.f34527t;
                if (kVar == C11857k.FIT_CENTER || ((kVar == C11857k.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f34531x))) {
                    this.f34513f.postScale(min, min, C11865c.m43467q(this.f34516i), C11865c.m43468r(this.f34516i));
                    m43392m();
                }
                if (this.f34522o) {
                    f3 = -this.f34502D;
                } else {
                    f3 = this.f34502D;
                }
                if (this.f34523p) {
                    f4 = -this.f34502D;
                } else {
                    f4 = this.f34502D;
                }
                this.f34513f.postScale(f3, f4, C11865c.m43467q(this.f34516i), C11865c.m43468r(this.f34516i));
                m43392m();
                this.f34513f.mapRect(cropWindowRect);
                if (z) {
                    if (f > C11865c.m43474x(this.f34516i)) {
                        f5 = 0.0f;
                    } else {
                        f5 = Math.max(Math.min((f / 2.0f) - cropWindowRect.centerX(), -C11865c.m43471u(this.f34516i)), ((float) getWidth()) - C11865c.m43472v(this.f34516i)) / f3;
                    }
                    this.f34503E = f5;
                    if (f2 <= C11865c.m43470t(this.f34516i)) {
                        f6 = Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerY(), -C11865c.m43473w(this.f34516i)), ((float) getHeight()) - C11865c.m43466p(this.f34516i)) / f4;
                    }
                    this.f34504F = f6;
                } else {
                    this.f34503E = Math.min(Math.max(this.f34503E * f3, -cropWindowRect.left), (-cropWindowRect.right) + f) / f3;
                    this.f34504F = Math.min(Math.max(this.f34504F * f4, -cropWindowRect.top), (-cropWindowRect.bottom) + f2) / f4;
                }
                this.f34513f.postTranslate(this.f34503E * f3, this.f34504F * f4);
                cropWindowRect.offset(this.f34503E * f3, this.f34504F * f4);
                this.f34512e.setCropWindowRect(cropWindowRect);
                m43392m();
                this.f34512e.invalidate();
                if (z2) {
                    this.f34518k.mo31864a(this.f34516i, this.f34513f);
                    this.f34511d.startAnimation(this.f34518k);
                } else {
                    this.f34511d.setImageMatrix(this.f34513f);
                }
                m43396x(false);
            }
        }
    }

    /* renamed from: e */
    private void m43389e() {
        Bitmap bitmap = this.f34519l;
        if (bitmap != null && (this.f34526s > 0 || this.f34500B != null)) {
            bitmap.recycle();
        }
        this.f34519l = null;
        this.f34526s = 0;
        this.f34500B = null;
        this.f34501C = 1;
        this.f34521n = 0;
        this.f34502D = 1.0f;
        this.f34503E = Utils.FLOAT_EPSILON;
        this.f34504F = Utils.FLOAT_EPSILON;
        this.f34513f.reset();
        this.f34508J = null;
        this.f34511d.setImageBitmap((Bitmap) null);
        m43394u();
    }

    /* renamed from: k */
    private static int m43390k(int i, int i2, int i3) {
        return i == 1073741824 ? i2 : i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m43391l(boolean r11, boolean r12) {
        /*
            r10 = this;
            int r0 = r10.getWidth()
            int r1 = r10.getHeight()
            android.graphics.Bitmap r2 = r10.f34519l
            if (r2 == 0) goto L_0x00f7
            if (r0 <= 0) goto L_0x00f7
            if (r1 <= 0) goto L_0x00f7
            com.theartofdev.edmodo.cropper.CropOverlayView r2 = r10.f34512e
            android.graphics.RectF r2 = r2.getCropWindowRect()
            r3 = 0
            if (r11 == 0) goto L_0x003b
            float r11 = r2.left
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 < 0) goto L_0x0033
            float r11 = r2.top
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 < 0) goto L_0x0033
            float r11 = r2.right
            float r12 = (float) r0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x0033
            float r11 = r2.bottom
            float r12 = (float) r1
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x00f7
        L_0x0033:
            float r11 = (float) r0
            float r12 = (float) r1
            r0 = 0
            r10.m43388d(r11, r12, r0, r0)
            goto L_0x00f7
        L_0x003b:
            boolean r11 = r10.f34531x
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r11 != 0) goto L_0x0047
            float r11 = r10.f34502D
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x00f7
        L_0x0047:
            float r11 = r10.f34502D
            int r5 = r10.f34532y
            float r5 = (float) r5
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0088
            float r11 = r2.width()
            float r5 = (float) r0
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r5 * r6
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0088
            float r11 = r2.height()
            float r7 = (float) r1
            float r6 = r6 * r7
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x0088
            int r11 = r10.f34532y
            float r11 = (float) r11
            float r6 = r2.width()
            float r8 = r10.f34502D
            float r6 = r6 / r8
            r8 = 1059313418(0x3f23d70a, float:0.64)
            float r6 = r6 / r8
            float r5 = r5 / r6
            float r6 = r2.height()
            float r9 = r10.f34502D
            float r6 = r6 / r9
            float r6 = r6 / r8
            float r7 = r7 / r6
            float r5 = java.lang.Math.min(r5, r7)
            float r11 = java.lang.Math.min(r11, r5)
            goto L_0x0089
        L_0x0088:
            r11 = r3
        L_0x0089:
            float r5 = r10.f34502D
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c5
            float r5 = r2.width()
            float r6 = (float) r0
            r7 = 1059481190(0x3f266666, float:0.65)
            float r8 = r6 * r7
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x00a7
            float r5 = r2.height()
            float r8 = (float) r1
            float r8 = r8 * r7
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c5
        L_0x00a7:
            float r11 = r2.width()
            float r5 = r10.f34502D
            float r11 = r11 / r5
            r5 = 1057132380(0x3f028f5c, float:0.51)
            float r11 = r11 / r5
            float r6 = r6 / r11
            float r11 = (float) r1
            float r2 = r2.height()
            float r7 = r10.f34502D
            float r2 = r2 / r7
            float r2 = r2 / r5
            float r11 = r11 / r2
            float r11 = java.lang.Math.min(r6, r11)
            float r11 = java.lang.Math.max(r4, r11)
        L_0x00c5:
            boolean r2 = r10.f34531x
            if (r2 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r4 = r11
        L_0x00cb:
            int r11 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x00f7
            float r11 = r10.f34502D
            int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x00f7
            if (r12 == 0) goto L_0x00ef
            com.theartofdev.edmodo.cropper.d r11 = r10.f34518k
            if (r11 != 0) goto L_0x00e6
            com.theartofdev.edmodo.cropper.d r11 = new com.theartofdev.edmodo.cropper.d
            android.widget.ImageView r2 = r10.f34511d
            com.theartofdev.edmodo.cropper.CropOverlayView r3 = r10.f34512e
            r11.<init>(r2, r3)
            r10.f34518k = r11
        L_0x00e6:
            com.theartofdev.edmodo.cropper.d r11 = r10.f34518k
            float[] r2 = r10.f34516i
            android.graphics.Matrix r3 = r10.f34513f
            r11.mo31866b(r2, r3)
        L_0x00ef:
            r10.f34502D = r4
            float r11 = (float) r0
            float r0 = (float) r1
            r1 = 1
            r10.m43388d(r11, r0, r1, r12)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageView.m43391l(boolean, boolean):void");
    }

    /* renamed from: m */
    private void m43392m() {
        float[] fArr = this.f34516i;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = (float) this.f34519l.getWidth();
        float[] fArr2 = this.f34516i;
        fArr2[3] = 0.0f;
        fArr2[4] = (float) this.f34519l.getWidth();
        this.f34516i[5] = (float) this.f34519l.getHeight();
        float[] fArr3 = this.f34516i;
        fArr3[6] = 0.0f;
        fArr3[7] = (float) this.f34519l.getHeight();
        this.f34513f.mapPoints(this.f34516i);
        float[] fArr4 = this.f34517j;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.f34513f.mapPoints(fArr4);
    }

    /* renamed from: t */
    private void m43393t(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        Bitmap bitmap2 = this.f34519l;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f34511d.clearAnimation();
            m43389e();
            this.f34519l = bitmap;
            this.f34511d.setImageBitmap(bitmap);
            this.f34500B = uri;
            this.f34526s = i;
            this.f34501C = i2;
            this.f34521n = i3;
            m43388d((float) getWidth(), (float) getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f34512e;
            if (cropOverlayView != null) {
                cropOverlayView.mo31840r();
                m43394u();
            }
        }
    }

    /* renamed from: u */
    private void m43394u() {
        int i;
        CropOverlayView cropOverlayView = this.f34512e;
        if (cropOverlayView != null) {
            if (!this.f34529v || this.f34519l == null) {
                i = 4;
            } else {
                i = 0;
            }
            cropOverlayView.setVisibility(i);
        }
    }

    /* renamed from: v */
    private void m43395v() {
        boolean z;
        int i = 0;
        if (!this.f34530w || ((this.f34519l != null || this.f34509K == null) && this.f34510L == null)) {
            z = false;
        } else {
            z = true;
        }
        ProgressBar progressBar = this.f34515h;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: x */
    private void m43396x(boolean z) {
        float[] fArr;
        if (this.f34519l != null && !z) {
            this.f34512e.mo31852t((float) getWidth(), (float) getHeight(), (((float) this.f34501C) * 100.0f) / C11865c.m43474x(this.f34517j), (((float) this.f34501C) * 100.0f) / C11865c.m43470t(this.f34517j));
        }
        CropOverlayView cropOverlayView = this.f34512e;
        if (z) {
            fArr = null;
        } else {
            fArr = this.f34516i;
        }
        cropOverlayView.mo31841s(fArr, getWidth(), getHeight());
    }

    /* renamed from: f */
    public void mo31767f() {
        this.f34522o = !this.f34522o;
        m43388d((float) getWidth(), (float) getHeight(), true, false);
    }

    /* renamed from: g */
    public void mo31768g() {
        this.f34523p = !this.f34523p;
        m43388d((float) getWidth(), (float) getHeight(), true, false);
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.f34512e.getAspectRatioX()), Integer.valueOf(this.f34512e.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f34512e.getCropWindowRect();
        float f = cropWindowRect.left;
        float f2 = cropWindowRect.top;
        float f3 = cropWindowRect.right;
        float f4 = cropWindowRect.bottom;
        float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
        this.f34513f.invert(this.f34514g);
        this.f34514g.mapPoints(fArr);
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * ((float) this.f34501C);
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i = this.f34501C;
        Bitmap bitmap = this.f34519l;
        if (bitmap == null) {
            return null;
        }
        return C11865c.m43469s(getCropPoints(), bitmap.getWidth() * i, i * bitmap.getHeight(), this.f34512e.mo31837m(), this.f34512e.getAspectRatioX(), this.f34512e.getAspectRatioY());
    }

    public C11849c getCropShape() {
        return this.f34512e.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f34512e;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        return mo31784i(0, 0, C11856j.NONE);
    }

    public void getCroppedImageAsync() {
        mo31785j(0, 0, C11856j.NONE);
    }

    public C11850d getGuidelines() {
        return this.f34512e.getGuidelines();
    }

    public int getImageResource() {
        return this.f34526s;
    }

    public Uri getImageUri() {
        return this.f34500B;
    }

    public int getMaxZoom() {
        return this.f34532y;
    }

    public int getRotatedDegrees() {
        return this.f34521n;
    }

    public C11857k getScaleType() {
        return this.f34527t;
    }

    public Rect getWholeImageRect() {
        int i = this.f34501C;
        Bitmap bitmap = this.f34519l;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    /* renamed from: h */
    public Bitmap mo31783h(int i, int i2) {
        return mo31784i(i, i2, C11856j.RESIZE_INSIDE);
    }

    /* renamed from: i */
    public Bitmap mo31784i(int i, int i2, C11856j jVar) {
        int i3;
        int i4;
        Bitmap bitmap;
        C11856j jVar2 = jVar;
        if (this.f34519l == null) {
            return null;
        }
        this.f34511d.clearAnimation();
        C11856j jVar3 = C11856j.NONE;
        int i5 = 0;
        if (jVar2 != jVar3) {
            i3 = i;
        } else {
            i3 = 0;
        }
        if (jVar2 != jVar3) {
            i5 = i2;
        }
        if (this.f34500B == null || (this.f34501C <= 1 && jVar2 != C11856j.SAMPLING)) {
            i4 = i3;
            bitmap = C11865c.m43457g(this.f34519l, getCropPoints(), this.f34521n, this.f34512e.mo31837m(), this.f34512e.getAspectRatioX(), this.f34512e.getAspectRatioY(), this.f34522o, this.f34523p).f34633a;
        } else {
            i4 = i3;
            bitmap = C11865c.m43454d(getContext(), this.f34500B, getCropPoints(), this.f34521n, this.f34519l.getWidth() * this.f34501C, this.f34519l.getHeight() * this.f34501C, this.f34512e.mo31837m(), this.f34512e.getAspectRatioX(), this.f34512e.getAspectRatioY(), i3, i5, this.f34522o, this.f34523p).f34633a;
        }
        return C11865c.m43475y(bitmap, i4, i5, jVar2);
    }

    /* renamed from: j */
    public void mo31785j(int i, int i2, C11856j jVar) {
        if (this.f34499A != null) {
            mo31820w(i, i2, jVar, (Uri) null, (Bitmap.CompressFormat) null, 0);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo31786n(C11861a.C11862a aVar) {
        this.f34510L = null;
        m43395v();
        C11851e eVar = this.f34499A;
        if (eVar != null) {
            eVar.mo31759t(this, new C11848b(this.f34519l, this.f34500B, aVar.f34611a, aVar.f34612b, aVar.f34613c, getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), aVar.f34615e));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo31787o(C11863b.C11864a aVar) {
        this.f34509K = null;
        m43395v();
        if (aVar.f34625e == null) {
            int i = aVar.f34624d;
            this.f34520m = i;
            m43393t(aVar.f34622b, 0, aVar.f34621a, aVar.f34623c, i);
        }
        C11855i iVar = this.f34533z;
        if (iVar != null) {
            iVar.mo31756i0(this, aVar.f34621a, aVar.f34625e);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f34524q <= 0 || this.f34525r <= 0) {
            m43396x(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f34524q;
        layoutParams.height = this.f34525r;
        setLayoutParams(layoutParams);
        if (this.f34519l != null) {
            float f = (float) (i3 - i);
            float f2 = (float) (i4 - i2);
            m43388d(f, f2, true, false);
            if (this.f34505G != null) {
                int i5 = this.f34506H;
                if (i5 != this.f34520m) {
                    this.f34521n = i5;
                    m43388d(f, f2, true, false);
                }
                this.f34513f.mapRect(this.f34505G);
                this.f34512e.setCropWindowRect(this.f34505G);
                m43391l(false, false);
                this.f34512e.mo31836i();
                this.f34505G = null;
            } else if (this.f34507I) {
                this.f34507I = false;
                m43391l(false, false);
            }
        } else {
            m43396x(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        double d;
        double d2;
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f34519l;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < this.f34519l.getWidth()) {
                d = ((double) size) / ((double) this.f34519l.getWidth());
            } else {
                d = Double.POSITIVE_INFINITY;
            }
            if (size2 < this.f34519l.getHeight()) {
                d2 = ((double) size2) / ((double) this.f34519l.getHeight());
            } else {
                d2 = Double.POSITIVE_INFINITY;
            }
            if (d == Double.POSITIVE_INFINITY && d2 == Double.POSITIVE_INFINITY) {
                i4 = this.f34519l.getWidth();
                i3 = this.f34519l.getHeight();
            } else if (d <= d2) {
                i3 = (int) (((double) this.f34519l.getHeight()) * d);
                i4 = size;
            } else {
                i4 = (int) (((double) this.f34519l.getWidth()) * d2);
                i3 = size2;
            }
            int k = m43390k(mode, size, i4);
            int k2 = m43390k(mode2, size2, i3);
            this.f34524q = k;
            this.f34525r = k2;
            setMeasuredDimension(k, k2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Bitmap bitmap;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f34509K == null && this.f34500B == null && this.f34519l == null && this.f34526s == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair pair = C11865c.f34632g;
                        if (pair == null || !((String) pair.first).equals(string)) {
                            bitmap = null;
                        } else {
                            bitmap = (Bitmap) ((WeakReference) C11865c.f34632g.second).get();
                        }
                        C11865c.f34632g = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            m43393t(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.f34500B == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i > 0) {
                        setImageResource(i);
                    } else {
                        Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i2 = bundle.getInt("DEGREES_ROTATED");
                this.f34506H = i2;
                this.f34521n = i2;
                Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    this.f34512e.setInitialCropWindowRect(rect);
                }
                RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                if (rectF != null && (rectF.width() > Utils.FLOAT_EPSILON || rectF.height() > Utils.FLOAT_EPSILON)) {
                    this.f34505G = rectF;
                }
                this.f34512e.setCropShape(C11849c.valueOf(bundle.getString("CROP_SHAPE")));
                this.f34531x = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.f34532y = bundle.getInt("CROP_MAX_ZOOM");
                this.f34522o = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.f34523p = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        C11863b bVar;
        if (this.f34500B == null && this.f34519l == null && this.f34526s < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.f34500B;
        if (this.f34528u && uri == null && this.f34526s < 1) {
            uri = C11865c.m43450D(getContext(), this.f34519l, this.f34508J);
            this.f34508J = uri;
        }
        if (!(uri == null || this.f34519l == null)) {
            String uuid = UUID.randomUUID().toString();
            C11865c.f34632g = new Pair(uuid, new WeakReference(this.f34519l));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference weakReference = this.f34509K;
        if (!(weakReference == null || (bVar = (C11863b) weakReference.get()) == null)) {
            bundle.putParcelable("LOADING_IMAGE_URI", bVar.mo31860b());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f34526s);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f34501C);
        bundle.putInt("DEGREES_ROTATED", this.f34521n);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f34512e.getInitialCropWindowRect());
        RectF rectF = C11865c.f34628c;
        rectF.set(this.f34512e.getCropWindowRect());
        this.f34513f.invert(this.f34514g);
        this.f34514g.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", this.f34512e.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f34531x);
        bundle.putInt("CROP_MAX_ZOOM", this.f34532y);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f34522o);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f34523p);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 <= 0 || i4 <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f34507I = z;
    }

    /* renamed from: p */
    public void mo31793p(int i) {
        int i2;
        boolean z;
        float f;
        float f2;
        int i3 = i;
        if (this.f34519l != null) {
            if (i3 < 0) {
                i2 = (i3 % 360) + 360;
            } else {
                i2 = i3 % 360;
            }
            if (this.f34512e.mo31837m() || ((i2 <= 45 || i2 >= 135) && (i2 <= 215 || i2 >= 305))) {
                z = false;
            } else {
                z = true;
            }
            RectF rectF = C11865c.f34628c;
            rectF.set(this.f34512e.getCropWindowRect());
            if (z) {
                f = rectF.height();
            } else {
                f = rectF.width();
            }
            float f3 = f / 2.0f;
            if (z) {
                f2 = rectF.width();
            } else {
                f2 = rectF.height();
            }
            float f4 = f2 / 2.0f;
            if (z) {
                boolean z2 = this.f34522o;
                this.f34522o = this.f34523p;
                this.f34523p = z2;
            }
            this.f34513f.invert(this.f34514g);
            float[] fArr = C11865c.f34629d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f34514g.mapPoints(fArr);
            this.f34521n = (this.f34521n + i2) % 360;
            m43388d((float) getWidth(), (float) getHeight(), true, false);
            Matrix matrix = this.f34513f;
            float[] fArr2 = C11865c.f34630e;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = (float) (((double) this.f34502D) / Math.sqrt(Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d) + Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d)));
            this.f34502D = sqrt;
            this.f34502D = Math.max(sqrt, 1.0f);
            m43388d((float) getWidth(), (float) getHeight(), true, false);
            this.f34513f.mapPoints(fArr2, fArr);
            double sqrt2 = Math.sqrt(Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d) + Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d));
            float f5 = (float) (((double) f3) * sqrt2);
            float f6 = (float) (((double) f4) * sqrt2);
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            rectF.set(f7 - f5, f8 - f6, f7 + f5, f8 + f6);
            this.f34512e.mo31840r();
            this.f34512e.setCropWindowRect(rectF);
            m43388d((float) getWidth(), (float) getHeight(), true, false);
            m43391l(false, false);
            this.f34512e.mo31836i();
        }
    }

    /* renamed from: q */
    public void mo31794q(Uri uri, Bitmap.CompressFormat compressFormat, int i, int i2, int i3) {
        mo31795r(uri, compressFormat, i, i2, i3, C11856j.RESIZE_INSIDE);
    }

    /* renamed from: r */
    public void mo31795r(Uri uri, Bitmap.CompressFormat compressFormat, int i, int i2, int i3, C11856j jVar) {
        if (this.f34499A != null) {
            mo31820w(i2, i3, jVar, uri, compressFormat, i);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    /* renamed from: s */
    public void mo31796s(int i, int i2) {
        this.f34512e.setAspectRatioX(i);
        this.f34512e.setAspectRatioY(i2);
        setFixedAspectRatio(true);
    }

    public void setAutoZoomEnabled(boolean z) {
        if (this.f34531x != z) {
            this.f34531x = z;
            m43391l(false, false);
            this.f34512e.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f34512e.setInitialCropWindowRect(rect);
    }

    public void setCropShape(C11849c cVar) {
        this.f34512e.setCropShape(cVar);
    }

    public void setFixedAspectRatio(boolean z) {
        this.f34512e.setFixedAspectRatio(z);
    }

    public void setFlippedHorizontally(boolean z) {
        if (this.f34522o != z) {
            this.f34522o = z;
            m43388d((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z) {
        if (this.f34523p != z) {
            this.f34523p = z;
            m43388d((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public void setGuidelines(C11850d dVar) {
        this.f34512e.setGuidelines(dVar);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f34512e.setInitialCropWindowRect((Rect) null);
        m43393t(bitmap, 0, (Uri) null, 1, 0);
    }

    public void setImageResource(int i) {
        if (i != 0) {
            this.f34512e.setInitialCropWindowRect((Rect) null);
            m43393t(BitmapFactory.decodeResource(getResources(), i), i, (Uri) null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        C11863b bVar;
        if (uri != null) {
            WeakReference weakReference = this.f34509K;
            if (weakReference != null) {
                bVar = (C11863b) weakReference.get();
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.cancel(true);
            }
            m43389e();
            this.f34505G = null;
            this.f34506H = 0;
            this.f34512e.setInitialCropWindowRect((Rect) null);
            WeakReference weakReference2 = new WeakReference(new C11863b(this, uri));
            this.f34509K = weakReference2;
            ((C11863b) weakReference2.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m43395v();
        }
    }

    public void setMaxZoom(int i) {
        if (this.f34532y != i && i > 0) {
            this.f34532y = i;
            m43391l(false, false);
            this.f34512e.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean z) {
        if (this.f34512e.mo31853u(z)) {
            m43391l(false, false);
            this.f34512e.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(C11851e eVar) {
        this.f34499A = eVar;
    }

    public void setOnCropWindowChangedListener(C11854h hVar) {
    }

    public void setOnSetCropOverlayMovedListener(C11852f fVar) {
    }

    public void setOnSetCropOverlayReleasedListener(C11853g gVar) {
    }

    public void setOnSetImageUriCompleteListener(C11855i iVar) {
        this.f34533z = iVar;
    }

    public void setRotatedDegrees(int i) {
        int i2 = this.f34521n;
        if (i2 != i) {
            mo31793p(i - i2);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z) {
        this.f34528u = z;
    }

    public void setScaleType(C11857k kVar) {
        if (kVar != this.f34527t) {
            this.f34527t = kVar;
            this.f34502D = 1.0f;
            this.f34504F = Utils.FLOAT_EPSILON;
            this.f34503E = Utils.FLOAT_EPSILON;
            this.f34512e.mo31840r();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z) {
        if (this.f34529v != z) {
            this.f34529v = z;
            m43394u();
        }
    }

    public void setShowProgressBar(boolean z) {
        if (this.f34530w != z) {
            this.f34530w = z;
            m43395v();
        }
    }

    public void setSnapRadius(float f) {
        if (f >= Utils.FLOAT_EPSILON) {
            this.f34512e.setSnapRadius(f);
        }
    }

    /* renamed from: w */
    public void mo31820w(int i, int i2, C11856j jVar, Uri uri, Bitmap.CompressFormat compressFormat, int i3) {
        C11861a aVar;
        int i4;
        int i5;
        CropImageView cropImageView;
        C11856j jVar2 = jVar;
        Bitmap bitmap = this.f34519l;
        if (bitmap != null) {
            this.f34511d.clearAnimation();
            WeakReference weakReference = this.f34510L;
            if (weakReference != null) {
                aVar = (C11861a) weakReference.get();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.cancel(true);
            }
            C11856j jVar3 = C11856j.NONE;
            if (jVar2 != jVar3) {
                i4 = i;
            } else {
                i4 = 0;
            }
            if (jVar2 != jVar3) {
                i5 = i2;
            } else {
                i5 = 0;
            }
            int width = bitmap.getWidth() * this.f34501C;
            int height = bitmap.getHeight();
            int i6 = this.f34501C;
            int i7 = height * i6;
            if (this.f34500B == null || (i6 <= 1 && jVar2 != C11856j.SAMPLING)) {
                C11861a aVar2 = r0;
                C11861a aVar3 = new C11861a(this, bitmap, getCropPoints(), this.f34521n, this.f34512e.mo31837m(), this.f34512e.getAspectRatioX(), this.f34512e.getAspectRatioY(), i4, i5, this.f34522o, this.f34523p, jVar, uri, compressFormat, i3);
                cropImageView = this;
                cropImageView.f34510L = new WeakReference(aVar2);
            } else {
                C11861a aVar4 = r0;
                C11861a aVar5 = new C11861a(this, this.f34500B, getCropPoints(), this.f34521n, width, i7, this.f34512e.mo31837m(), this.f34512e.getAspectRatioX(), this.f34512e.getAspectRatioY(), i4, i5, this.f34522o, this.f34523p, jVar, uri, compressFormat, i3);
                this.f34510L = new WeakReference(aVar4);
                cropImageView = this;
            }
            ((C11861a) cropImageView.f34510L.get()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            m43395v();
            return;
        }
    }
}
