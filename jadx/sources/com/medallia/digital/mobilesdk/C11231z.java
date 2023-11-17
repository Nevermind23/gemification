package com.medallia.digital.mobilesdk;

import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.github.mikephil.charting.utils.Utils;
import com.medallia.digital.mobilesdk.C10992m1;

/* renamed from: com.medallia.digital.mobilesdk.z */
class C11231z implements View.OnTouchListener {

    /* renamed from: n */
    private static final int f32554n = 100;

    /* renamed from: o */
    private static final int f32555o = 10;

    /* renamed from: p */
    private static final float f32556p = 2.0f;

    /* renamed from: a */
    private final C10992m1.C10995c f32557a;

    /* renamed from: b */
    private final GestureDetector f32558b;

    /* renamed from: c */
    private int f32559c;

    /* renamed from: d */
    private C11234c f32560d;

    /* renamed from: e */
    private float f32561e;

    /* renamed from: f */
    private float f32562f;

    /* renamed from: g */
    private float f32563g;

    /* renamed from: h */
    private float f32564h;

    /* renamed from: i */
    private long f32565i;

    /* renamed from: j */
    private long f32566j;

    /* renamed from: k */
    private boolean f32567k;

    /* renamed from: l */
    private final boolean f32568l;

    /* renamed from: m */
    private int f32569m = 0;

    /* renamed from: com.medallia.digital.mobilesdk.z$b */
    private class C11233b extends GestureDetector.SimpleOnGestureListener {
        private C11233b() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.z$c */
    private enum C11234c {
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r10.f30850a.f30679l != false) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0063 A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065 A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071 A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072 A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075 A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11231z(com.medallia.digital.mobilesdk.C10992m1 r8, boolean r9, com.medallia.digital.mobilesdk.C10771d0 r10) {
        /*
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.f32569m = r0
            com.medallia.digital.mobilesdk.m1$c r1 = r8.f31564b
            r7.f32557a = r1
            r7.f32568l = r9
            com.medallia.digital.mobilesdk.i4 r9 = com.medallia.digital.mobilesdk.C10884i4.m39721c()
            android.content.Context r9 = r9.mo28483b()
            android.view.GestureDetector r1 = new android.view.GestureDetector
            com.medallia.digital.mobilesdk.z$b r2 = new com.medallia.digital.mobilesdk.z$b
            r3 = 0
            r2.<init>()
            r1.<init>(r9, r2)
            r7.f32558b = r1
            com.medallia.digital.mobilesdk.i4 r9 = com.medallia.digital.mobilesdk.C10884i4.m39721c()     // Catch:{ Exception -> 0x00c9 }
            android.content.MutableContextWrapper r9 = r9.mo28484d()     // Catch:{ Exception -> 0x00c9 }
            android.content.Context r9 = r9.getBaseContext()     // Catch:{ Exception -> 0x00c9 }
            android.app.Activity r9 = (android.app.Activity) r9     // Catch:{ Exception -> 0x00c9 }
            android.view.Window r1 = r9.getWindow()     // Catch:{ Exception -> 0x00c9 }
            android.view.WindowManager$LayoutParams r2 = r1.getAttributes()     // Catch:{ Exception -> 0x00c9 }
            int r2 = r2.flags     // Catch:{ Exception -> 0x00c9 }
            r3 = 1024(0x400, float:1.435E-42)
            r2 = r2 & r3
            r4 = 1
            if (r2 != 0) goto L_0x004d
            android.view.View r2 = r1.getDecorView()     // Catch:{ Exception -> 0x00c9 }
            int r2 = r2.getSystemUiVisibility()     // Catch:{ Exception -> 0x00c9 }
            r5 = 4
            if (r2 < r5) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r0
            goto L_0x004e
        L_0x004d:
            r2 = r4
        L_0x004e:
            android.view.WindowManager$LayoutParams r5 = r1.getAttributes()     // Catch:{ Exception -> 0x00c9 }
            int r5 = r5.flags     // Catch:{ Exception -> 0x00c9 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0065
            android.view.View r5 = r1.getDecorView()     // Catch:{ Exception -> 0x00c9 }
            int r5 = r5.getSystemUiVisibility()     // Catch:{ Exception -> 0x00c9 }
            if (r5 != r3) goto L_0x0065
            r3 = r4
            goto L_0x0066
        L_0x0065:
            r3 = r0
        L_0x0066:
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()     // Catch:{ Exception -> 0x00c9 }
            int r1 = r1.flags     // Catch:{ Exception -> 0x00c9 }
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r4 = r0
        L_0x0073:
            if (r4 == 0) goto L_0x008c
            int r1 = com.medallia.digital.mobilesdk.C10985l6.m40217b()     // Catch:{ Exception -> 0x00c9 }
            if (r1 <= 0) goto L_0x0083
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ Exception -> 0x00c9 }
            int r0 = r0.getDimensionPixelSize(r1)     // Catch:{ Exception -> 0x00c9 }
        L_0x0083:
            com.medallia.digital.mobilesdk.b0 r10 = r10.f30850a     // Catch:{ Exception -> 0x00c9 }
            boolean r10 = r10.f30679l     // Catch:{ Exception -> 0x00c9 }
            if (r10 == 0) goto L_0x00b2
        L_0x0089:
            int r0 = r0 + 15
            goto L_0x00b2
        L_0x008c:
            if (r2 == 0) goto L_0x009b
            com.medallia.digital.mobilesdk.b0 r1 = r10.f30850a     // Catch:{ Exception -> 0x00c9 }
            boolean r1 = r1.f30679l     // Catch:{ Exception -> 0x00c9 }
            if (r1 == 0) goto L_0x009b
            if (r3 != 0) goto L_0x009b
            r10 = 15
            r7.f32569m = r10     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00b4
        L_0x009b:
            if (r3 == 0) goto L_0x00b4
            int r1 = com.medallia.digital.mobilesdk.C10985l6.m40217b()     // Catch:{ Exception -> 0x00c9 }
            if (r1 <= 0) goto L_0x00ab
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ Exception -> 0x00c9 }
            int r0 = r0.getDimensionPixelSize(r1)     // Catch:{ Exception -> 0x00c9 }
        L_0x00ab:
            com.medallia.digital.mobilesdk.b0 r10 = r10.f30850a     // Catch:{ Exception -> 0x00c9 }
            boolean r10 = r10.f30679l     // Catch:{ Exception -> 0x00c9 }
            if (r10 == 0) goto L_0x00b2
            goto L_0x0089
        L_0x00b2:
            r7.f32569m = r0     // Catch:{ Exception -> 0x00c9 }
        L_0x00b4:
            boolean r8 = r8.f31565c     // Catch:{ Exception -> 0x00c9 }
            if (r8 == 0) goto L_0x00d1
            int r8 = com.medallia.digital.mobilesdk.C10985l6.m40217b()     // Catch:{ Exception -> 0x00c9 }
            if (r8 <= 0) goto L_0x00d1
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ Exception -> 0x00c9 }
            int r8 = r9.getDimensionPixelSize(r8)     // Catch:{ Exception -> 0x00c9 }
            r7.f32569m = r8     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00d1
        L_0x00c9:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r8)
        L_0x00d1:
            com.medallia.digital.mobilesdk.i4 r8 = com.medallia.digital.mobilesdk.C10884i4.m39721c()
            android.app.Application r8 = r8.mo28481a()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            if (r8 == 0) goto L_0x00f6
            android.view.Display r8 = r8.getDefaultDisplay()
            android.graphics.Point r9 = new android.graphics.Point
            r9.<init>()
            r8.getSize(r9)
            r8.getRealSize(r9)
            int r8 = r9.y
            r7.f32559c = r8
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11231z.<init>(com.medallia.digital.mobilesdk.m1, boolean, com.medallia.digital.mobilesdk.d0):void");
    }

    /* renamed from: a */
    private void m41171a() {
        this.f32563g = Utils.FLOAT_EPSILON;
        this.f32561e = Utils.FLOAT_EPSILON;
        this.f32562f = Utils.FLOAT_EPSILON;
        this.f32564h = Utils.FLOAT_EPSILON;
        this.f32566j = 0;
        this.f32565i = 0;
        this.f32567k = false;
        this.f32560d = null;
    }

    /* renamed from: b */
    private boolean m41172b() {
        if (this.f32566j - this.f32565i <= 10) {
            return false;
        }
        this.f32565i = 0;
        this.f32566j = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29185c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo29186d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo29187e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo29188f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo29189g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo29190h() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        C10771d0 d0Var;
        C11234c cVar;
        if (!this.f32558b.onTouchEvent(motionEvent)) {
            int rawY = (int) motionEvent.getRawY();
            int rawX = (int) motionEvent.getRawX();
            if (motionEvent.getAction() == 0) {
                this.f32565i = motionEvent.getEventTime();
                this.f32561e = motionEvent.getRawY();
                this.f32563g = motionEvent.getRawX();
            }
            if (motionEvent.getAction() == 1) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                C11234c cVar2 = this.f32560d;
                if (cVar2 == C11234c.TOP) {
                    if (((float) Math.abs(layoutParams.topMargin)) < ((float) view.getHeight()) / f32556p) {
                        layoutParams.topMargin = this.f32569m;
                    } else {
                        mo29190h();
                        m41171a();
                    }
                } else if (cVar2 != C11234c.BOTTOM) {
                    if (cVar2 != C11234c.LEFT) {
                        if (cVar2 == C11234c.RIGHT) {
                            if (((float) Math.abs(layoutParams.leftMargin)) >= ((float) view.getWidth()) / f32556p) {
                                mo29189g();
                            }
                        }
                        m41171a();
                    } else if (((float) Math.abs(layoutParams.rightMargin)) >= ((float) view.getWidth()) / f32556p) {
                        mo29188f();
                        m41171a();
                    }
                    layoutParams.rightMargin = 0;
                    layoutParams.leftMargin = 0;
                } else if (((float) Math.abs(layoutParams.bottomMargin)) < ((float) view.getHeight()) / f32556p) {
                    layoutParams.bottomMargin = 0;
                } else {
                    mo29187e();
                    m41171a();
                }
                view.setLayoutParams(layoutParams);
                m41171a();
            }
            if (motionEvent.getAction() == 2) {
                this.f32562f = motionEvent.getRawY();
                this.f32564h = motionEvent.getRawX();
                this.f32566j = motionEvent.getEventTime();
                if (!this.f32567k) {
                    if (Math.abs(this.f32561e - this.f32562f) > 100.0f) {
                        C10992m1.C10995c cVar3 = this.f32557a;
                        if (cVar3 == C10992m1.C10995c.TOP) {
                            cVar = C11234c.TOP;
                        } else {
                            if (cVar3 == C10992m1.C10995c.BOTTOM) {
                                cVar = C11234c.BOTTOM;
                            }
                            this.f32567k = true;
                        }
                    } else {
                        float f = this.f32563g - this.f32564h;
                        if (f <= Utils.FLOAT_EPSILON || Math.abs(f) <= 100.0f) {
                            float f2 = this.f32563g - this.f32564h;
                            if (f2 < Utils.FLOAT_EPSILON && Math.abs(f2) > 100.0f) {
                                cVar = C11234c.RIGHT;
                            }
                        } else {
                            cVar = C11234c.LEFT;
                        }
                    }
                    this.f32560d = cVar;
                    this.f32567k = true;
                }
                if (m41172b()) {
                    if (this.f32568l || ((d0Var = (C10771d0) view) != null && d0Var.f30854e)) {
                        mo29186d();
                    }
                    if (view != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                        if (this.f32560d == C11234c.TOP && rawY >= 0 && rawY <= view.getHeight() + this.f32569m) {
                            layoutParams2.topMargin = -(view.getHeight() - rawY);
                        } else if (this.f32560d != C11234c.BOTTOM || rawY >= (i = this.f32559c) || rawY < i - view.getHeight()) {
                            C11234c cVar4 = this.f32560d;
                            if (cVar4 == C11234c.LEFT) {
                                int width = view.getWidth() - rawX;
                                layoutParams2.leftMargin = -width;
                                layoutParams2.rightMargin = width;
                            } else if (cVar4 == C11234c.RIGHT) {
                                int width2 = view.getWidth() - (view.getWidth() - rawX);
                                layoutParams2.rightMargin = -width2;
                                layoutParams2.leftMargin = width2;
                            }
                        } else {
                            layoutParams2.bottomMargin = -(view.getHeight() - (this.f32559c - rawY));
                        }
                        view.setLayoutParams(layoutParams2);
                    }
                }
            }
        } else if (this.f32568l) {
            mo29185c();
        }
        return true;
    }
}
