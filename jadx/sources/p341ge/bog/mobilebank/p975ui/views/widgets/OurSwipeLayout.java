package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.core.view.C1266x;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001a0.C0011d;
import p366bk.C10322k;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout */
public class OurSwipeLayout extends FrameLayout {
    private static final int DRAG_BOTTOM = 8;
    private static final int DRAG_LEFT = 1;
    private static final int DRAG_RIGHT = 2;
    private static final int DRAG_TOP = 4;
    private static final DragEdge DefaultDragEdge = DragEdge.Right;
    @Deprecated
    public static final int EMPTY_LAYOUT = -1;
    View.OnClickListener clickListener;
    private GestureDetector gestureDetector;
    private Rect hitSurfaceRect;
    View.OnLongClickListener longClickListener;
    /* access modifiers changed from: private */
    public boolean mClickToClose;
    /* access modifiers changed from: private */
    public DragEdge mCurrentDragEdge;
    /* access modifiers changed from: private */
    public DoubleClickListener mDoubleClickListener;
    /* access modifiers changed from: private */
    public int mDragDistance;
    private LinkedHashMap<DragEdge, View> mDragEdges;
    private C0011d mDragHelper;
    private C0011d.C0014c mDragHelperCallback;
    private float[] mEdgeSwipesOffset;
    private int mEventCounter;
    private boolean mIsBeingDragged;
    private List<OnLayout> mOnLayoutListeners;
    private Map<View, ArrayList<OnRevealListener>> mRevealListeners;
    private Map<View, Boolean> mShowEntirely;
    /* access modifiers changed from: private */
    public ShowMode mShowMode;
    private List<SwipeDenier> mSwipeDeniers;
    private boolean mSwipeEnabled;
    /* access modifiers changed from: private */
    public List<SwipeListener> mSwipeListeners;
    private boolean[] mSwipesEnabled;
    private int mTouchSlop;
    private Map<View, Rect> mViewBoundCache;
    private boolean onlyOneSwipe;

    /* renamed from: sX */
    private float f86388sX;

    /* renamed from: sY */
    private float f86389sY;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DoubleClickListener */
    public interface DoubleClickListener {
        void onDoubleClick(OurSwipeLayout ourSwipeLayout, boolean z);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge */
    public enum DragEdge {
        Left,
        Top,
        Right,
        Bottom
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$OnLayout */
    public interface OnLayout {
        void onLayout(OurSwipeLayout ourSwipeLayout);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$OnRevealListener */
    public interface OnRevealListener {
        void onReveal(View view, DragEdge dragEdge, float f, int i);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$ShowMode */
    public enum ShowMode {
        LayDown,
        PullOut
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status */
    public enum Status {
        Middle,
        Open,
        Close
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$SwipeDenier */
    public interface SwipeDenier {
        boolean shouldDenySwipe(MotionEvent motionEvent);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$SwipeListener */
    public interface SwipeListener {
        void onClose(OurSwipeLayout ourSwipeLayout);

        void onHandRelease(OurSwipeLayout ourSwipeLayout, float f, float f2);

        void onOpen(OurSwipeLayout ourSwipeLayout);

        void onStartClose(OurSwipeLayout ourSwipeLayout);

        void onStartOpen(OurSwipeLayout ourSwipeLayout);

        void onUpdate(OurSwipeLayout ourSwipeLayout, int i, int i2);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$a */
    class C35753a extends C0011d.C0014c {

        /* renamed from: c */
        boolean f86390c = true;

        C35753a() {
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (view == OurSwipeLayout.this.getSurfaceView()) {
                int i3 = C35756d.f86394a[OurSwipeLayout.this.mCurrentDragEdge.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    return OurSwipeLayout.this.getPaddingLeft();
                }
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (i > OurSwipeLayout.this.getPaddingLeft()) {
                            return OurSwipeLayout.this.getPaddingLeft();
                        }
                        if (i < OurSwipeLayout.this.getPaddingLeft() - OurSwipeLayout.this.mDragDistance) {
                            return OurSwipeLayout.this.getPaddingLeft() - OurSwipeLayout.this.mDragDistance;
                        }
                    }
                } else if (i < OurSwipeLayout.this.getPaddingLeft()) {
                    return OurSwipeLayout.this.getPaddingLeft();
                } else {
                    if (i > OurSwipeLayout.this.getPaddingLeft() + OurSwipeLayout.this.mDragDistance) {
                        return OurSwipeLayout.this.getPaddingLeft() + OurSwipeLayout.this.mDragDistance;
                    }
                }
            } else if (OurSwipeLayout.this.getCurrentBottomView() == view) {
                int i4 = C35756d.f86394a[OurSwipeLayout.this.mCurrentDragEdge.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    return OurSwipeLayout.this.getPaddingLeft();
                }
                if (i4 != 3) {
                    if (i4 == 4 && OurSwipeLayout.this.mShowMode == ShowMode.PullOut && i < OurSwipeLayout.this.getMeasuredWidth() - OurSwipeLayout.this.mDragDistance) {
                        return OurSwipeLayout.this.getMeasuredWidth() - OurSwipeLayout.this.mDragDistance;
                    }
                } else if (OurSwipeLayout.this.mShowMode == ShowMode.PullOut && i > OurSwipeLayout.this.getPaddingLeft()) {
                    return OurSwipeLayout.this.getPaddingLeft();
                }
            }
            return i;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int i3;
            if (view == OurSwipeLayout.this.getSurfaceView()) {
                int i4 = C35756d.f86394a[OurSwipeLayout.this.mCurrentDragEdge.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3 || i4 == 4) {
                            return OurSwipeLayout.this.getPaddingTop();
                        }
                    } else if (i < OurSwipeLayout.this.getPaddingTop() - OurSwipeLayout.this.mDragDistance) {
                        return OurSwipeLayout.this.getPaddingTop() - OurSwipeLayout.this.mDragDistance;
                    } else {
                        if (i > OurSwipeLayout.this.getPaddingTop()) {
                            return OurSwipeLayout.this.getPaddingTop();
                        }
                    }
                } else if (i < OurSwipeLayout.this.getPaddingTop()) {
                    return OurSwipeLayout.this.getPaddingTop();
                } else {
                    if (i > OurSwipeLayout.this.getPaddingTop() + OurSwipeLayout.this.mDragDistance) {
                        return OurSwipeLayout.this.getPaddingTop() + OurSwipeLayout.this.mDragDistance;
                    }
                }
            } else {
                View surfaceView = OurSwipeLayout.this.getSurfaceView();
                if (surfaceView == null) {
                    i3 = 0;
                } else {
                    i3 = surfaceView.getTop();
                }
                int i5 = C35756d.f86394a[OurSwipeLayout.this.mCurrentDragEdge.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3 || i5 == 4) {
                            return OurSwipeLayout.this.getPaddingTop();
                        }
                    } else if (OurSwipeLayout.this.mShowMode != ShowMode.PullOut) {
                        int i6 = i3 + i2;
                        if (i6 >= OurSwipeLayout.this.getPaddingTop()) {
                            return OurSwipeLayout.this.getPaddingTop();
                        }
                        if (i6 <= OurSwipeLayout.this.getPaddingTop() - OurSwipeLayout.this.mDragDistance) {
                            return OurSwipeLayout.this.getPaddingTop() - OurSwipeLayout.this.mDragDistance;
                        }
                    } else if (i < OurSwipeLayout.this.getMeasuredHeight() - OurSwipeLayout.this.mDragDistance) {
                        return OurSwipeLayout.this.getMeasuredHeight() - OurSwipeLayout.this.mDragDistance;
                    }
                } else if (OurSwipeLayout.this.mShowMode != ShowMode.PullOut) {
                    int i7 = i3 + i2;
                    if (i7 < OurSwipeLayout.this.getPaddingTop()) {
                        return OurSwipeLayout.this.getPaddingTop();
                    }
                    if (i7 > OurSwipeLayout.this.getPaddingTop() + OurSwipeLayout.this.mDragDistance) {
                        return OurSwipeLayout.this.getPaddingTop() + OurSwipeLayout.this.mDragDistance;
                    }
                } else if (i > OurSwipeLayout.this.getPaddingTop()) {
                    return OurSwipeLayout.this.getPaddingTop();
                }
            }
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            return OurSwipeLayout.this.mDragDistance;
        }

        public int getViewVerticalDragRange(View view) {
            return OurSwipeLayout.this.mDragDistance;
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            View surfaceView = OurSwipeLayout.this.getSurfaceView();
            if (surfaceView != null) {
                View currentBottomView = OurSwipeLayout.this.getCurrentBottomView();
                int left = surfaceView.getLeft();
                int right = surfaceView.getRight();
                int top = surfaceView.getTop();
                int bottom = surfaceView.getBottom();
                if (view == surfaceView) {
                    if (OurSwipeLayout.this.mShowMode == ShowMode.PullOut && currentBottomView != null) {
                        if (OurSwipeLayout.this.mCurrentDragEdge == DragEdge.Left || OurSwipeLayout.this.mCurrentDragEdge == DragEdge.Right) {
                            currentBottomView.offsetLeftAndRight(i3);
                        } else {
                            currentBottomView.offsetTopAndBottom(i4);
                        }
                    }
                } else if (OurSwipeLayout.this.getBottomViews().contains(view)) {
                    if (OurSwipeLayout.this.mShowMode == ShowMode.PullOut) {
                        surfaceView.offsetLeftAndRight(i3);
                        surfaceView.offsetTopAndBottom(i4);
                    } else {
                        OurSwipeLayout ourSwipeLayout = OurSwipeLayout.this;
                        Rect h = ourSwipeLayout.computeBottomLayDown(ourSwipeLayout.mCurrentDragEdge);
                        if (currentBottomView != null) {
                            currentBottomView.layout(h.left, h.top, h.right, h.bottom);
                        }
                        int left2 = surfaceView.getLeft() + i3;
                        int top2 = surfaceView.getTop() + i4;
                        if (OurSwipeLayout.this.mCurrentDragEdge == DragEdge.Left && left2 < OurSwipeLayout.this.getPaddingLeft()) {
                            left2 = OurSwipeLayout.this.getPaddingLeft();
                        } else if (OurSwipeLayout.this.mCurrentDragEdge == DragEdge.Right && left2 > OurSwipeLayout.this.getPaddingLeft()) {
                            left2 = OurSwipeLayout.this.getPaddingLeft();
                        } else if (OurSwipeLayout.this.mCurrentDragEdge == DragEdge.Top && top2 < OurSwipeLayout.this.getPaddingTop()) {
                            top2 = OurSwipeLayout.this.getPaddingTop();
                        } else if (OurSwipeLayout.this.mCurrentDragEdge == DragEdge.Bottom && top2 > OurSwipeLayout.this.getPaddingTop()) {
                            top2 = OurSwipeLayout.this.getPaddingTop();
                        }
                        surfaceView.layout(left2, top2, OurSwipeLayout.this.getMeasuredWidth() + left2, OurSwipeLayout.this.getMeasuredHeight() + top2);
                    }
                }
                OurSwipeLayout.this.dispatchRevealEvent(left, top, right, bottom);
                OurSwipeLayout.this.dispatchSwipeEvent(left, top, i3, i4);
                OurSwipeLayout.this.invalidate();
                OurSwipeLayout.this.captureChildrenBound();
            }
        }

        public void onViewReleased(View view, float f, float f2) {
            super.onViewReleased(view, f, f2);
            OurSwipeLayout.this.processHandRelease(f, f2, this.f86390c);
            for (SwipeListener onHandRelease : OurSwipeLayout.this.mSwipeListeners) {
                onHandRelease.onHandRelease(OurSwipeLayout.this, f, f2);
            }
            OurSwipeLayout.this.invalidate();
        }

        public boolean tryCaptureView(View view, int i) {
            boolean z;
            boolean z2 = false;
            if (view == OurSwipeLayout.this.getSurfaceView() || OurSwipeLayout.this.getBottomViews().contains(view)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (OurSwipeLayout.this.getOpenStatus() == Status.Close) {
                    z2 = true;
                }
                this.f86390c = z2;
            }
            return z;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$b */
    class C35754b implements View.OnClickListener {
        C35754b() {
        }

        public void onClick(View view) {
            OurSwipeLayout.this.performAdapterViewItemClick();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$c */
    class C35755c implements View.OnLongClickListener {
        C35755c() {
        }

        public boolean onLongClick(View view) {
            boolean unused = OurSwipeLayout.this.performAdapterViewItemLongClick();
            return true;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$d */
    static /* synthetic */ class C35756d {

        /* renamed from: a */
        static final /* synthetic */ int[] f86394a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge[] r0 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f86394a = r0
                ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r1 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Top     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f86394a     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r1 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Bottom     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f86394a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r1 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Left     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f86394a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r1 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Right     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.C35756d.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$e */
    class C35757e extends GestureDetector.SimpleOnGestureListener {
        C35757e() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean z;
            if (OurSwipeLayout.this.mDoubleClickListener != null) {
                View currentBottomView = OurSwipeLayout.this.getCurrentBottomView();
                View surfaceView = OurSwipeLayout.this.getSurfaceView();
                if (currentBottomView == null || motionEvent.getX() <= ((float) currentBottomView.getLeft()) || motionEvent.getX() >= ((float) currentBottomView.getRight()) || motionEvent.getY() <= ((float) currentBottomView.getTop()) || motionEvent.getY() >= ((float) currentBottomView.getBottom())) {
                    currentBottomView = surfaceView;
                }
                DoubleClickListener c = OurSwipeLayout.this.mDoubleClickListener;
                OurSwipeLayout ourSwipeLayout = OurSwipeLayout.this;
                if (currentBottomView == surfaceView) {
                    z = true;
                } else {
                    z = false;
                }
                c.onDoubleClick(ourSwipeLayout, z);
            }
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (OurSwipeLayout.this.mClickToClose && OurSwipeLayout.this.isTouchOnSurface(motionEvent)) {
                OurSwipeLayout.this.close();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    public OurSwipeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void captureChildrenBound() {
        View currentBottomView = getCurrentBottomView();
        View surfaceView = getSurfaceView();
        if (getOpenStatus() == Status.Close) {
            this.mViewBoundCache.remove(currentBottomView);
            if (surfaceView != null) {
                this.mViewBoundCache.remove(surfaceView);
                return;
            }
            return;
        }
        View[] viewArr = {getSurfaceView(), currentBottomView};
        for (int i = 0; i < 2; i++) {
            View view = viewArr[i];
            Rect rect = this.mViewBoundCache.get(view);
            if (rect == null) {
                rect = new Rect();
                this.mViewBoundCache.put(view, rect);
            }
            rect.left = view.getLeft();
            rect.top = view.getTop();
            rect.right = view.getRight();
            rect.bottom = view.getBottom();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkCanDrag(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.mIsBeingDragged
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r0 = r11.getOpenStatus()
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r1 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.Status.Middle
            r2 = 1
            if (r0 != r1) goto L_0x0011
            r11.mIsBeingDragged = r2
            return
        L_0x0011:
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r0 = r11.getOpenStatus()
            float r3 = r12.getRawX()
            float r4 = r11.f86388sX
            float r3 = r3 - r4
            float r12 = r12.getRawY()
            float r4 = r11.f86389sY
            float r12 = r12 - r4
            float r4 = r12 / r3
            float r4 = java.lang.Math.abs(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.atan(r4)
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r5 = r11.getOpenStatus()
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r6 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.Status.Close
            if (r5 != r6) goto L_0x007b
            r5 = 1110704128(0x42340000, float:45.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r7 = 0
            if (r5 >= 0) goto L_0x005d
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x004f
            boolean r5 = r11.isLeftSwipeEnabled()
            if (r5 == 0) goto L_0x004f
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r5 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Left
            goto L_0x0076
        L_0x004f:
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x005c
            boolean r5 = r11.isRightSwipeEnabled()
            if (r5 == 0) goto L_0x005c
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r5 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Right
            goto L_0x0076
        L_0x005c:
            return
        L_0x005d:
            int r5 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x006a
            boolean r5 = r11.isTopSwipeEnabled()
            if (r5 == 0) goto L_0x006a
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r5 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Top
            goto L_0x0076
        L_0x006a:
            int r5 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x007a
            boolean r5 = r11.isBottomSwipeEnabled()
            if (r5 == 0) goto L_0x007a
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r5 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Bottom
        L_0x0076:
            r11.setCurrentDragEdge(r5)
            goto L_0x007b
        L_0x007a:
            return
        L_0x007b:
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r5 = r11.mCurrentDragEdge
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r7 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Right
            r8 = 1106247680(0x41f00000, float:30.0)
            r9 = 0
            if (r5 != r7) goto L_0x00ac
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r7 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.Status.Open
            if (r0 != r7) goto L_0x008f
            int r7 = r11.mTouchSlop
            float r7 = (float) r7
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0099
        L_0x008f:
            if (r0 != r6) goto L_0x009b
            int r7 = r11.mTouchSlop
            int r7 = -r7
            float r7 = (float) r7
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
        L_0x0099:
            r7 = r2
            goto L_0x009c
        L_0x009b:
            r7 = r9
        L_0x009c:
            if (r7 != 0) goto L_0x00a3
            if (r0 != r1) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r7 = r9
            goto L_0x00a4
        L_0x00a3:
            r7 = r2
        L_0x00a4:
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x00aa
            if (r7 != 0) goto L_0x00ac
        L_0x00aa:
            r7 = r2
            goto L_0x00ad
        L_0x00ac:
            r7 = r9
        L_0x00ad:
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r10 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Left
            if (r5 != r10) goto L_0x00d8
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r10 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.Status.Open
            if (r0 != r10) goto L_0x00bd
            int r10 = r11.mTouchSlop
            int r10 = -r10
            float r10 = (float) r10
            int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x00c6
        L_0x00bd:
            if (r0 != r6) goto L_0x00c8
            int r10 = r11.mTouchSlop
            float r10 = (float) r10
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c8
        L_0x00c6:
            r3 = r2
            goto L_0x00c9
        L_0x00c8:
            r3 = r9
        L_0x00c9:
            if (r3 != 0) goto L_0x00d0
            if (r0 != r1) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r3 = r9
            goto L_0x00d1
        L_0x00d0:
            r3 = r2
        L_0x00d1:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x00d7
            if (r3 != 0) goto L_0x00d8
        L_0x00d7:
            r7 = r2
        L_0x00d8:
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r3 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Top
            r8 = 1114636288(0x42700000, float:60.0)
            if (r5 != r3) goto L_0x0105
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r3 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.Status.Open
            if (r0 != r3) goto L_0x00ea
            int r3 = r11.mTouchSlop
            int r3 = -r3
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x00f3
        L_0x00ea:
            if (r0 != r6) goto L_0x00f5
            int r3 = r11.mTouchSlop
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f5
        L_0x00f3:
            r3 = r2
            goto L_0x00f6
        L_0x00f5:
            r3 = r9
        L_0x00f6:
            if (r3 != 0) goto L_0x00fd
            if (r0 != r1) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r3 = r9
            goto L_0x00fe
        L_0x00fd:
            r3 = r2
        L_0x00fe:
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0104
            if (r3 != 0) goto L_0x0105
        L_0x0104:
            r7 = r2
        L_0x0105:
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r3 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Bottom
            if (r5 != r3) goto L_0x012d
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r3 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.Status.Open
            if (r0 != r3) goto L_0x0114
            int r3 = r11.mTouchSlop
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x011e
        L_0x0114:
            if (r0 != r6) goto L_0x0120
            int r3 = r11.mTouchSlop
            int r3 = -r3
            float r3 = (float) r3
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 >= 0) goto L_0x0120
        L_0x011e:
            r12 = r2
            goto L_0x0121
        L_0x0120:
            r12 = r9
        L_0x0121:
            if (r12 != 0) goto L_0x0125
            if (r0 != r1) goto L_0x0126
        L_0x0125:
            r9 = r2
        L_0x0126:
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 < 0) goto L_0x012c
            if (r9 != 0) goto L_0x012d
        L_0x012c:
            r7 = r2
        L_0x012d:
            r12 = r7 ^ 1
            r11.mIsBeingDragged = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.checkCanDrag(android.view.MotionEvent):void");
    }

    private void collapseOthersIfNeeded() {
        ViewParent parent;
        if (this.onlyOneSwipe && (parent = getParent()) != null && parent.getParent() != null && (parent.getParent() instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) parent.getParent();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int i2 = C10322k.swipe_layout;
                if (!(childAt.findViewById(i2) == null || childAt.findViewById(i2) == this)) {
                    OurSwipeLayout ourSwipeLayout = (OurSwipeLayout) childAt.findViewById(i2);
                    if (ourSwipeLayout.getOpenStatus() == Status.Open) {
                        ourSwipeLayout.close();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public Rect computeBottomLayDown(DragEdge dragEdge) {
        int i;
        int i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        DragEdge dragEdge2 = DragEdge.Right;
        if (dragEdge == dragEdge2) {
            paddingLeft = getMeasuredWidth() - this.mDragDistance;
        } else if (dragEdge == DragEdge.Bottom) {
            paddingTop = getMeasuredHeight() - this.mDragDistance;
        }
        if (dragEdge == DragEdge.Left || dragEdge == dragEdge2) {
            i = this.mDragDistance + paddingLeft;
            i2 = getMeasuredHeight();
        } else {
            i = getMeasuredWidth() + paddingLeft;
            i2 = this.mDragDistance;
        }
        return new Rect(paddingLeft, paddingTop, i, i2 + paddingTop);
    }

    private Rect computeBottomLayoutAreaViaSurface(ShowMode showMode, Rect rect) {
        View currentBottomView = getCurrentBottomView();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (showMode == ShowMode.PullOut) {
            DragEdge dragEdge = this.mCurrentDragEdge;
            DragEdge dragEdge2 = DragEdge.Left;
            if (dragEdge == dragEdge2) {
                i -= this.mDragDistance;
            } else if (dragEdge == DragEdge.Right) {
                i = i3;
            } else {
                i2 = dragEdge == DragEdge.Top ? i2 - this.mDragDistance : i4;
            }
            int i5 = 0;
            if (dragEdge == dragEdge2 || dragEdge == DragEdge.Right) {
                if (currentBottomView != null) {
                    i5 = currentBottomView.getMeasuredWidth();
                }
                i3 = i5 + i;
            } else {
                if (currentBottomView != null) {
                    i5 = currentBottomView.getMeasuredHeight();
                }
                i4 = i2 + i5;
                i3 = rect.right;
            }
        } else if (showMode == ShowMode.LayDown) {
            DragEdge dragEdge3 = this.mCurrentDragEdge;
            if (dragEdge3 == DragEdge.Left) {
                i3 = i + this.mDragDistance;
            } else if (dragEdge3 == DragEdge.Right) {
                i = i3 - this.mDragDistance;
            } else if (dragEdge3 == DragEdge.Top) {
                i4 = i2 + this.mDragDistance;
            } else {
                i2 = i4 - this.mDragDistance;
            }
        }
        return new Rect(i, i2, i3, i4);
    }

    private Rect computeSurfaceLayoutArea(boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (z) {
            DragEdge dragEdge = this.mCurrentDragEdge;
            if (dragEdge == DragEdge.Left) {
                paddingLeft = this.mDragDistance + getPaddingLeft();
            } else if (dragEdge == DragEdge.Right) {
                paddingLeft = getPaddingLeft() - this.mDragDistance;
            } else if (dragEdge == DragEdge.Top) {
                paddingTop = this.mDragDistance + getPaddingTop();
            } else {
                paddingTop = getPaddingTop() - this.mDragDistance;
            }
        }
        return new Rect(paddingLeft, paddingTop, getMeasuredWidth() + paddingLeft, getMeasuredHeight() + paddingTop);
    }

    private int dp2px(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private AdapterView getAdapterView() {
        ViewParent parent = getParent();
        if (parent instanceof AdapterView) {
            return (AdapterView) parent;
        }
        return null;
    }

    private float getCurrentOffset() {
        DragEdge dragEdge = this.mCurrentDragEdge;
        if (dragEdge == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.mEdgeSwipesOffset[dragEdge.ordinal()];
    }

    private boolean insideAdapterView() {
        return getAdapterView() != null;
    }

    /* access modifiers changed from: private */
    public boolean isTouchOnSurface(MotionEvent motionEvent) {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return false;
        }
        if (this.hitSurfaceRect == null) {
            this.hitSurfaceRect = new Rect();
        }
        surfaceView.getHitRect(this.hitSurfaceRect);
        return this.hitSurfaceRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = (android.widget.AdapterView) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void performAdapterViewItemClick() {
        /*
            r5 = this;
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r0 = r5.getOpenStatus()
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$Status r1 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.Status.Close
            if (r0 == r1) goto L_0x0009
            return
        L_0x0009:
            android.view.ViewParent r0 = r5.getParent()
            boolean r1 = r0 instanceof android.widget.AdapterView
            if (r1 == 0) goto L_0x002f
            android.widget.AdapterView r0 = (android.widget.AdapterView) r0
            int r1 = r0.getPositionForView(r5)
            r2 = -1
            if (r1 == r2) goto L_0x002f
            int r2 = r0.getFirstVisiblePosition()
            int r2 = r1 - r2
            android.view.View r2 = r0.getChildAt(r2)
            android.widget.Adapter r3 = r0.getAdapter()
            long r3 = r3.getItemId(r1)
            r0.performItemClick(r2, r1, r3)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.performAdapterViewItemClick():void");
    }

    /* access modifiers changed from: private */
    public boolean performAdapterViewItemLongClick() {
        AdapterView adapterView;
        int positionForView;
        boolean z;
        if (getOpenStatus() != Status.Close) {
            return false;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof AdapterView) || (positionForView = adapterView.getPositionForView(this)) == -1) {
            return false;
        }
        long itemIdAtPosition = (adapterView = (AdapterView) parent).getItemIdAtPosition(positionForView);
        try {
            Method declaredMethod = AbsListView.class.getDeclaredMethod("performLongPress", new Class[]{View.class, Integer.TYPE, Long.TYPE});
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(adapterView, new Object[]{this, Integer.valueOf(positionForView), Long.valueOf(itemIdAtPosition)})).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            if (adapterView.getOnItemLongClickListener() != null) {
                z = adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition);
            } else {
                z = false;
            }
            if (z) {
                adapterView.performHapticFeedback(0);
            }
            return z;
        }
    }

    private void safeBottomView() {
        Status openStatus = getOpenStatus();
        List<View> bottomViews = getBottomViews();
        if (openStatus == Status.Close) {
            for (View next : bottomViews) {
                if (!(next == null || next.getVisibility() == 4)) {
                    next.setVisibility(4);
                }
            }
            return;
        }
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null && currentBottomView.getVisibility() != 0) {
            currentBottomView.setVisibility(0);
        }
    }

    private void setCurrentDragEdge(DragEdge dragEdge) {
        this.mCurrentDragEdge = dragEdge;
        updateBottomViews();
    }

    private void updateBottomViews() {
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            DragEdge dragEdge = this.mCurrentDragEdge;
            if (dragEdge == DragEdge.Left || dragEdge == DragEdge.Right) {
                this.mDragDistance = currentBottomView.getMeasuredWidth() - dp2px(getCurrentOffset());
            } else {
                this.mDragDistance = currentBottomView.getMeasuredHeight() - dp2px(getCurrentOffset());
            }
        }
        ShowMode showMode = this.mShowMode;
        if (showMode == ShowMode.PullOut) {
            layoutPullOut();
        } else if (showMode == ShowMode.LayDown) {
            layoutLayDown();
        }
        safeBottomView();
    }

    public void addDrag(DragEdge dragEdge, int i) {
        addDrag(dragEdge, findViewById(i), (ViewGroup.LayoutParams) null);
    }

    public void addOnLayoutListener(OnLayout onLayout) {
        if (this.mOnLayoutListeners == null) {
            this.mOnLayoutListeners = new ArrayList();
        }
        this.mOnLayoutListeners.add(onLayout);
    }

    public void addRevealListener(int i, OnRevealListener onRevealListener) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            if (!this.mShowEntirely.containsKey(findViewById)) {
                this.mShowEntirely.put(findViewById, Boolean.FALSE);
            }
            if (this.mRevealListeners.get(findViewById) == null) {
                this.mRevealListeners.put(findViewById, new ArrayList());
            }
            this.mRevealListeners.get(findViewById).add(onRevealListener);
            return;
        }
        throw new IllegalArgumentException("Child does not belong to SwipeListener.");
    }

    public void addSwipeDenier(SwipeDenier swipeDenier) {
        this.mSwipeDeniers.add(swipeDenier);
    }

    public void addSwipeListener(SwipeListener swipeListener) {
        this.mSwipeListeners.add(swipeListener);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        if (view != null) {
            try {
                i2 = ((Integer) layoutParams.getClass().getField("gravity").get(layoutParams)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                i2 = 0;
            }
            if (i2 <= 0) {
                Iterator<Map.Entry<DragEdge, View>> it = this.mDragEdges.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry next = it.next();
                    if (next.getValue() == null) {
                        this.mDragEdges.put((DragEdge) next.getKey(), view);
                        break;
                    }
                }
            } else {
                int b = C1266x.m4406b(i2, ViewCompat.m3541B(this));
                if ((b & 3) == 3) {
                    this.mDragEdges.put(DragEdge.Left, view);
                }
                if ((b & 5) == 5) {
                    this.mDragEdges.put(DragEdge.Right, view);
                }
                if ((b & 48) == 48) {
                    this.mDragEdges.put(DragEdge.Top, view);
                }
                if ((b & 80) == 80) {
                    this.mDragEdges.put(DragEdge.Bottom, view);
                }
            }
            if (view.getParent() != this) {
                super.addView(view, i, layoutParams);
            }
        }
    }

    public void clearDragEdge() {
        this.mDragEdges.clear();
    }

    public void close() {
        close(true, true);
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.mDragHelper.mo46k(true)) {
            ViewCompat.m3601i0(this);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchRevealEvent(int r15, int r16, int r17, int r18) {
        /*
            r14 = this;
            r8 = r14
            java.util.Map<android.view.View, java.util.ArrayList<ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$OnRevealListener>> r0 = r8.mRevealListeners
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000a
            return
        L_0x000a:
            java.util.Map<android.view.View, java.util.ArrayList<ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$OnRevealListener>> r0 = r8.mRevealListeners
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0014:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r9.next()
            r10 = r0
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getKey()
            r11 = r0
            android.view.View r11 = (android.view.View) r11
            android.graphics.Rect r12 = r14.getRelativePosition(r11)
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r3 = r8.mCurrentDragEdge
            r0 = r14
            r1 = r11
            r2 = r12
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            boolean r0 = r0.isViewShowing(r1, r2, r3, r4, r5, r6, r7)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0116
            java.util.Map<android.view.View, java.lang.Boolean> r0 = r8.mShowEntirely
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.put(r11, r1)
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$ShowMode r0 = r14.getShowMode()
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$ShowMode r1 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.ShowMode.LayDown
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r0 != r1) goto L_0x0092
            int[] r0 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.C35756d.f86394a
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r1 = r8.mCurrentDragEdge
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r5) goto L_0x0088
            if (r0 == r4) goto L_0x007e
            if (r0 == r3) goto L_0x0074
            if (r0 == r2) goto L_0x0069
            goto L_0x00e7
        L_0x0069:
            int r0 = r12.right
            int r6 = r0 - r17
            float r0 = (float) r6
            int r1 = r11.getWidth()
            goto L_0x00e4
        L_0x0074:
            int r0 = r12.left
            int r6 = r0 - r15
            float r0 = (float) r6
            int r1 = r11.getWidth()
            goto L_0x00e4
        L_0x007e:
            int r0 = r12.bottom
            int r6 = r0 - r18
            float r0 = (float) r6
            int r1 = r11.getHeight()
            goto L_0x00e4
        L_0x0088:
            int r0 = r12.top
            int r6 = r0 - r16
            float r0 = (float) r6
            int r1 = r11.getHeight()
            goto L_0x00e4
        L_0x0092:
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$ShowMode r0 = r14.getShowMode()
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$ShowMode r1 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.ShowMode.PullOut
            if (r0 != r1) goto L_0x00e7
            int[] r0 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.C35756d.f86394a
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r1 = r8.mCurrentDragEdge
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r5) goto L_0x00d7
            if (r0 == r4) goto L_0x00c9
            if (r0 == r3) goto L_0x00bb
            if (r0 == r2) goto L_0x00ad
            goto L_0x00e7
        L_0x00ad:
            int r0 = r12.left
            int r1 = r14.getWidth()
            int r6 = r0 - r1
            float r0 = (float) r6
            int r1 = r11.getWidth()
            goto L_0x00e4
        L_0x00bb:
            int r0 = r12.right
            int r1 = r14.getPaddingLeft()
            int r6 = r0 - r1
            float r0 = (float) r6
            int r1 = r11.getWidth()
            goto L_0x00e4
        L_0x00c9:
            int r0 = r12.top
            int r1 = r14.getHeight()
            int r6 = r0 - r1
            float r0 = (float) r6
            int r1 = r11.getHeight()
            goto L_0x00e4
        L_0x00d7:
            int r0 = r12.bottom
            int r1 = r14.getPaddingTop()
            int r6 = r0 - r1
            float r0 = (float) r6
            int r1 = r11.getHeight()
        L_0x00e4:
            float r1 = (float) r1
            float r7 = r0 / r1
        L_0x00e7:
            java.lang.Object r0 = r10.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00f1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0116
            java.lang.Object r1 = r0.next()
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$OnRevealListener r1 = (p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.OnRevealListener) r1
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r2 = r8.mCurrentDragEdge
            float r3 = java.lang.Math.abs(r7)
            r1.onReveal(r11, r2, r3, r6)
            float r1 = java.lang.Math.abs(r7)
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x00f1
            java.util.Map<android.view.View, java.lang.Boolean> r1 = r8.mShowEntirely
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.put(r11, r2)
            goto L_0x00f1
        L_0x0116:
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r3 = r8.mCurrentDragEdge
            r0 = r14
            r1 = r11
            r2 = r12
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            boolean r0 = r0.isViewTotallyFirstShowed(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0014
            java.util.Map<android.view.View, java.lang.Boolean> r0 = r8.mShowEntirely
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r11, r1)
            java.lang.Object r0 = r10.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0139:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0014
            java.lang.Object r1 = r0.next()
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$OnRevealListener r1 = (p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.OnRevealListener) r1
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r2 = r8.mCurrentDragEdge
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r3 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Left
            if (r2 == r3) goto L_0x0158
            ge.bog.mobilebank.ui.views.widgets.OurSwipeLayout$DragEdge r3 = p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.DragEdge.Right
            if (r2 != r3) goto L_0x0150
            goto L_0x0158
        L_0x0150:
            int r3 = r11.getHeight()
            r1.onReveal(r11, r2, r13, r3)
            goto L_0x0139
        L_0x0158:
            int r3 = r11.getWidth()
            r1.onReveal(r11, r2, r13, r3)
            goto L_0x0139
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout.dispatchRevealEvent(int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void dispatchSwipeEvent(int i, int i2, int i3, int i4) {
        DragEdge dragEdge = getDragEdge();
        boolean z = false;
        if (dragEdge != DragEdge.Left ? dragEdge != DragEdge.Right ? dragEdge != DragEdge.Top ? dragEdge != DragEdge.Bottom || i4 <= 0 : i4 >= 0 : i3 <= 0 : i3 >= 0) {
            z = true;
        }
        dispatchSwipeEvent(i, i2, z);
    }

    public List<View> getBottomViews() {
        ArrayList arrayList = new ArrayList();
        for (DragEdge dragEdge : DragEdge.values()) {
            arrayList.add(this.mDragEdges.get(dragEdge));
        }
        return arrayList;
    }

    public View getCurrentBottomView() {
        List<View> bottomViews = getBottomViews();
        if (this.mCurrentDragEdge.ordinal() < bottomViews.size()) {
            return bottomViews.get(this.mCurrentDragEdge.ordinal());
        }
        return null;
    }

    public int getDragDistance() {
        return this.mDragDistance;
    }

    public DragEdge getDragEdge() {
        return this.mCurrentDragEdge;
    }

    public Map<DragEdge, View> getDragEdgeMap() {
        return this.mDragEdges;
    }

    @Deprecated
    public List<DragEdge> getDragEdges() {
        return new ArrayList(this.mDragEdges.keySet());
    }

    public Status getOpenStatus() {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return Status.Close;
        }
        int left = surfaceView.getLeft();
        int top = surfaceView.getTop();
        if (left == getPaddingLeft() && top == getPaddingTop()) {
            return Status.Close;
        }
        if (left == getPaddingLeft() - this.mDragDistance || left == getPaddingLeft() + this.mDragDistance || top == getPaddingTop() - this.mDragDistance || top == getPaddingTop() + this.mDragDistance) {
            return Status.Open;
        }
        return Status.Middle;
    }

    /* access modifiers changed from: protected */
    public Rect getRelativePosition(View view) {
        Rect rect = new Rect(view.getLeft(), view.getTop(), 0, 0);
        View view2 = view;
        while (view2.getParent() != null && view2 != getRootView() && (view2 = (View) view2.getParent()) != this) {
            rect.left += view2.getLeft();
            rect.top += view2.getTop();
        }
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
        return rect;
    }

    public ShowMode getShowMode() {
        return this.mShowMode;
    }

    public View getSurfaceView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    public boolean isBottomSwipeEnabled() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.mDragEdges;
        DragEdge dragEdge = DragEdge.Bottom;
        View view = linkedHashMap.get(dragEdge);
        if (view == null || view.getParent() != this || view == getSurfaceView() || !this.mSwipesEnabled[dragEdge.ordinal()]) {
            return false;
        }
        return true;
    }

    public boolean isClickToClose() {
        return this.mClickToClose;
    }

    public boolean isLeftSwipeEnabled() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.mDragEdges;
        DragEdge dragEdge = DragEdge.Left;
        View view = linkedHashMap.get(dragEdge);
        if (view == null || view.getParent() != this || view == getSurfaceView() || !this.mSwipesEnabled[dragEdge.ordinal()]) {
            return false;
        }
        return true;
    }

    public boolean isRightSwipeEnabled() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.mDragEdges;
        DragEdge dragEdge = DragEdge.Right;
        View view = linkedHashMap.get(dragEdge);
        if (view == null || view.getParent() != this || view == getSurfaceView() || !this.mSwipesEnabled[dragEdge.ordinal()]) {
            return false;
        }
        return true;
    }

    public boolean isSwipeEnabled() {
        return this.mSwipeEnabled;
    }

    public boolean isTopSwipeEnabled() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.mDragEdges;
        DragEdge dragEdge = DragEdge.Top;
        View view = linkedHashMap.get(dragEdge);
        if (view == null || view.getParent() != this || view == getSurfaceView() || !this.mSwipesEnabled[dragEdge.ordinal()]) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isViewShowing(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (getShowMode() == ShowMode.LayDown) {
            int i9 = C35756d.f86394a[dragEdge.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4 && i3 > i5 && i3 <= i6) {
                            return true;
                        }
                        return false;
                    } else if (i >= i6 || i < i5) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i4 <= i7 || i4 > i8) {
                    return false;
                } else {
                    return true;
                }
            } else if (i2 < i7 || i2 >= i8) {
                return false;
            } else {
                return true;
            }
        } else if (getShowMode() != ShowMode.PullOut) {
            return false;
        } else {
            int i12 = C35756d.f86394a[dragEdge.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4 && i5 <= getWidth() && i6 > getWidth()) {
                            return true;
                        }
                        return false;
                    } else if (i6 < getPaddingLeft() || i5 >= getPaddingLeft()) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i7 >= getHeight() || i7 < getPaddingTop()) {
                    return false;
                } else {
                    return true;
                }
            } else if (i7 >= getPaddingTop() || i8 < getPaddingTop()) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean isViewTotallyFirstShowed(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        if (this.mShowEntirely.get(view).booleanValue()) {
            return false;
        }
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (getShowMode() == ShowMode.LayDown) {
            if ((dragEdge != DragEdge.Right || i3 > i5) && ((dragEdge != DragEdge.Left || i < i6) && ((dragEdge != DragEdge.Top || i2 < i8) && (dragEdge != DragEdge.Bottom || i4 > i7)))) {
                return false;
            }
        } else if (getShowMode() != ShowMode.PullOut) {
            return false;
        } else {
            if ((dragEdge != DragEdge.Right || i6 > getWidth()) && ((dragEdge != DragEdge.Left || i5 < getPaddingLeft()) && ((dragEdge != DragEdge.Top || i7 < getPaddingTop()) && (dragEdge != DragEdge.Bottom || i8 > getHeight())))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void layoutLayDown() {
        View surfaceView = getSurfaceView();
        Rect rect = this.mViewBoundCache.get(surfaceView);
        if (rect == null) {
            rect = computeSurfaceLayoutArea(false);
        }
        if (surfaceView != null) {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            bringChildToFront(surfaceView);
        }
        View currentBottomView = getCurrentBottomView();
        Rect rect2 = this.mViewBoundCache.get(currentBottomView);
        if (rect2 == null) {
            rect2 = computeBottomLayoutAreaViaSurface(ShowMode.LayDown, rect);
        }
        if (currentBottomView != null) {
            currentBottomView.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* access modifiers changed from: package-private */
    public void layoutPullOut() {
        View surfaceView = getSurfaceView();
        Rect rect = this.mViewBoundCache.get(surfaceView);
        if (rect == null) {
            rect = computeSurfaceLayoutArea(false);
        }
        if (surfaceView != null) {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            bringChildToFront(surfaceView);
        }
        View currentBottomView = getCurrentBottomView();
        Rect rect2 = this.mViewBoundCache.get(currentBottomView);
        if (rect2 == null) {
            rect2 = computeBottomLayoutAreaViaSurface(ShowMode.PullOut, rect);
        }
        if (currentBottomView != null) {
            currentBottomView.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (insideAdapterView()) {
            if (this.clickListener == null) {
                setOnClickListener(new C35754b());
            }
            if (this.longClickListener == null) {
                setOnLongClickListener(new C35755c());
            }
        }
        setOnlyOneSwipe(this.onlyOneSwipe);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (!isSwipeEnabled()) {
            return false;
        }
        if (this.mClickToClose && getOpenStatus() == Status.Open && isTouchOnSurface(motionEvent)) {
            return true;
        }
        for (SwipeDenier next : this.mSwipeDeniers) {
            if (next != null && next.shouldDenySwipe(motionEvent)) {
                return false;
            }
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    boolean z = this.mIsBeingDragged;
                    checkCanDrag(motionEvent);
                    if (this.mIsBeingDragged && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!z && this.mIsBeingDragged) {
                        return false;
                    }
                } else if (action != 3) {
                    this.mDragHelper.mo38A(motionEvent);
                }
            }
            this.mIsBeingDragged = false;
            this.mDragHelper.mo38A(motionEvent);
        } else {
            this.mDragHelper.mo38A(motionEvent);
            this.mIsBeingDragged = false;
            this.f86388sX = motionEvent.getRawX();
            this.f86389sY = motionEvent.getRawY();
            if (getOpenStatus() == Status.Middle) {
                this.mIsBeingDragged = true;
            }
        }
        return this.mIsBeingDragged;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        updateBottomViews();
        if (this.mOnLayoutListeners != null) {
            for (int i5 = 0; i5 < this.mOnLayoutListeners.size(); i5++) {
                this.mOnLayoutListeners.get(i5).onLayout(this);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isSwipeEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        this.gestureDetector.onTouchEvent(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        this.mDragHelper.mo38A(motionEvent);
                        if (!super.onTouchEvent(motionEvent) || !this.mIsBeingDragged || actionMasked == 0) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mDragHelper.mo38A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !this.mIsBeingDragged) {
            }
            return true;
        }
        this.mDragHelper.mo38A(motionEvent);
        this.f86388sX = motionEvent.getRawX();
        this.f86389sY = motionEvent.getRawY();
        checkCanDrag(motionEvent);
        if (this.mIsBeingDragged) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.mDragHelper.mo38A(motionEvent);
            collapseOthersIfNeeded();
        }
        return true;
    }

    public void onViewRemoved(View view) {
        for (Map.Entry entry : new HashMap(this.mDragEdges).entrySet()) {
            if (entry.getValue() == view) {
                this.mDragEdges.remove(entry.getKey());
            }
        }
    }

    public void open() {
        open(true, true);
    }

    /* access modifiers changed from: protected */
    public void processHandRelease(float f, float f2, boolean z) {
        float f3;
        float u = this.mDragHelper.mo48u();
        View surfaceView = getSurfaceView();
        DragEdge dragEdge = this.mCurrentDragEdge;
        if (dragEdge != null && surfaceView != null) {
            if (z) {
                f3 = 0.25f;
            } else {
                f3 = 0.75f;
            }
            if (dragEdge == DragEdge.Left) {
                if (f > u) {
                    open();
                } else if (f < (-u)) {
                    close();
                } else if ((((float) getSurfaceView().getLeft()) * 1.0f) / ((float) this.mDragDistance) > f3) {
                    open();
                } else {
                    close();
                }
            } else if (dragEdge == DragEdge.Right) {
                if (f > u) {
                    close();
                } else if (f < (-u)) {
                    open();
                } else if ((((float) (-getSurfaceView().getLeft())) * 1.0f) / ((float) this.mDragDistance) > f3) {
                    open();
                } else {
                    close();
                }
            } else if (dragEdge == DragEdge.Top) {
                if (f2 > u) {
                    open();
                } else if (f2 < (-u)) {
                    close();
                } else if ((((float) getSurfaceView().getTop()) * 1.0f) / ((float) this.mDragDistance) > f3) {
                    open();
                } else {
                    close();
                }
            } else if (dragEdge != DragEdge.Bottom) {
            } else {
                if (f2 > u) {
                    close();
                } else if (f2 < (-u)) {
                    open();
                } else if ((((float) (-getSurfaceView().getTop())) * 1.0f) / ((float) this.mDragDistance) > f3) {
                    open();
                } else {
                    close();
                }
            }
        }
    }

    public void removeAllRevealListeners(int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            this.mRevealListeners.remove(findViewById);
            this.mShowEntirely.remove(findViewById);
        }
    }

    public void removeAllSwipeDeniers() {
        this.mSwipeDeniers.clear();
    }

    public void removeAllSwipeListener() {
        this.mSwipeListeners.clear();
    }

    public void removeOnLayoutListener(OnLayout onLayout) {
        List<OnLayout> list = this.mOnLayoutListeners;
        if (list != null) {
            list.remove(onLayout);
        }
    }

    public void removeRevealListener(int i, OnRevealListener onRevealListener) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            this.mShowEntirely.remove(findViewById);
            if (this.mRevealListeners.containsKey(findViewById)) {
                this.mRevealListeners.get(findViewById).remove(onRevealListener);
            }
        }
    }

    public void removeSwipeDenier(SwipeDenier swipeDenier) {
        this.mSwipeDeniers.remove(swipeDenier);
    }

    public void removeSwipeListener(SwipeListener swipeListener) {
        this.mSwipeListeners.remove(swipeListener);
    }

    public void setBottomSwipeEnabled(boolean z) {
        this.mSwipesEnabled[DragEdge.Bottom.ordinal()] = z;
    }

    @Deprecated
    public void setBottomViewIds(int i, int i2, int i3, int i4) {
        addDrag(DragEdge.Left, findViewById(i));
        addDrag(DragEdge.Right, findViewById(i2));
        addDrag(DragEdge.Top, findViewById(i3));
        addDrag(DragEdge.Bottom, findViewById(i4));
    }

    public void setClickToClose(boolean z) {
        this.mClickToClose = z;
    }

    public void setDrag(DragEdge dragEdge, int i) {
        clearDragEdge();
        addDrag(dragEdge, i);
    }

    public void setDragDistance(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mDragDistance = dp2px((float) i);
        requestLayout();
    }

    @Deprecated
    public void setDragEdge(DragEdge dragEdge) {
        clearDragEdge();
        if (getChildCount() >= 2) {
            this.mDragEdges.put(dragEdge, getChildAt(getChildCount() - 2));
        }
        setCurrentDragEdge(dragEdge);
    }

    @Deprecated
    public void setDragEdges(List<DragEdge> list) {
        clearDragEdge();
        int min = Math.min(list.size(), getChildCount() - 1);
        for (int i = 0; i < min; i++) {
            this.mDragEdges.put(list.get(i), getChildAt(i));
        }
        if (list.size() == 0 || list.contains(DefaultDragEdge)) {
            setCurrentDragEdge(DefaultDragEdge);
        } else {
            setCurrentDragEdge(list.get(0));
        }
    }

    public void setLeftSwipeEnabled(boolean z) {
        this.mSwipesEnabled[DragEdge.Left.ordinal()] = z;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.clickListener = onClickListener;
    }

    public void setOnDoubleClickListener(DoubleClickListener doubleClickListener) {
        this.mDoubleClickListener = doubleClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.longClickListener = onLongClickListener;
    }

    public void setOnlyOneSwipe(boolean z) {
        this.onlyOneSwipe = z;
    }

    public void setRightSwipeEnabled(boolean z) {
        this.mSwipesEnabled[DragEdge.Right.ordinal()] = z;
    }

    public void setShowMode(ShowMode showMode) {
        this.mShowMode = showMode;
        requestLayout();
    }

    public void setSwipeEnabled(boolean z) {
        this.mSwipeEnabled = z;
    }

    public void setTopSwipeEnabled(boolean z) {
        this.mSwipesEnabled[DragEdge.Top.ordinal()] = z;
    }

    public void toggle() {
        toggle(true);
    }

    public OurSwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addDrag(DragEdge dragEdge, View view) {
        addDrag(dragEdge, view, (ViewGroup.LayoutParams) null);
    }

    public void close(boolean z) {
        close(z, true);
    }

    public void open(boolean z) {
        open(z, true);
    }

    public void toggle(boolean z) {
        if (getOpenStatus() == Status.Open) {
            close(z);
        } else if (getOpenStatus() == Status.Close) {
            open(z);
        }
    }

    public OurSwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentDragEdge = DefaultDragEdge;
        this.mDragDistance = 0;
        this.mDragEdges = new LinkedHashMap<>();
        this.mEdgeSwipesOffset = new float[4];
        this.mSwipeListeners = new ArrayList();
        this.mSwipeDeniers = new ArrayList();
        this.mRevealListeners = new HashMap();
        this.mShowEntirely = new HashMap();
        this.mViewBoundCache = new HashMap();
        this.mSwipeEnabled = true;
        this.mSwipesEnabled = new boolean[]{true, true, true, true};
        this.mClickToClose = false;
        this.onlyOneSwipe = true;
        this.mDragHelperCallback = new C35753a();
        this.mEventCounter = 0;
        this.f86388sX = -1.0f;
        this.f86389sY = -1.0f;
        this.gestureDetector = new GestureDetector(getContext(), new C35757e());
        this.mDragHelper = C0011d.m81m(this, this.mDragHelperCallback);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29166S7);
        int i2 = obtainStyledAttributes.getInt(C10330s.f29196V7, 2);
        float[] fArr = this.mEdgeSwipesOffset;
        DragEdge dragEdge = DragEdge.Left;
        fArr[dragEdge.ordinal()] = obtainStyledAttributes.getDimension(C10330s.f29206W7, Utils.FLOAT_EPSILON);
        float[] fArr2 = this.mEdgeSwipesOffset;
        DragEdge dragEdge2 = DragEdge.Right;
        fArr2[dragEdge2.ordinal()] = obtainStyledAttributes.getDimension(C10330s.f29216X7, Utils.FLOAT_EPSILON);
        float[] fArr3 = this.mEdgeSwipesOffset;
        DragEdge dragEdge3 = DragEdge.Top;
        fArr3[dragEdge3.ordinal()] = obtainStyledAttributes.getDimension(C10330s.f29236Z7, Utils.FLOAT_EPSILON);
        float[] fArr4 = this.mEdgeSwipesOffset;
        DragEdge dragEdge4 = DragEdge.Bottom;
        fArr4[dragEdge4.ordinal()] = obtainStyledAttributes.getDimension(C10330s.f29176T7, Utils.FLOAT_EPSILON);
        setClickToClose(obtainStyledAttributes.getBoolean(C10330s.f29186U7, this.mClickToClose));
        if ((i2 & 1) == 1) {
            this.mDragEdges.put(dragEdge, (Object) null);
        }
        if ((i2 & 4) == 4) {
            this.mDragEdges.put(dragEdge3, (Object) null);
        }
        if ((i2 & 2) == 2) {
            this.mDragEdges.put(dragEdge2, (Object) null);
        }
        if ((i2 & 8) == 8) {
            this.mDragEdges.put(dragEdge4, (Object) null);
        }
        this.mShowMode = ShowMode.values()[obtainStyledAttributes.getInt(C10330s.f29226Y7, ShowMode.PullOut.ordinal())];
        obtainStyledAttributes.recycle();
    }

    public void addDrag(DragEdge dragEdge, View view, ViewGroup.LayoutParams layoutParams) {
        int i;
        if (view != null) {
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
            }
            if (!checkLayoutParams(layoutParams)) {
                layoutParams = generateLayoutParams(layoutParams);
            }
            int i2 = C35756d.f86394a[dragEdge.ordinal()];
            if (i2 == 1) {
                i = 48;
            } else if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = i2 != 4 ? -1 : 5;
                }
            } else {
                i = 80;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = i;
            }
            addView(view, 0, layoutParams);
        }
    }

    public void close(boolean z, boolean z2) {
        View surfaceView = getSurfaceView();
        if (surfaceView != null) {
            if (z) {
                this.mDragHelper.mo42I(getSurfaceView(), getPaddingLeft(), getPaddingTop());
            } else {
                Rect computeSurfaceLayoutArea = computeSurfaceLayoutArea(false);
                int left = computeSurfaceLayoutArea.left - surfaceView.getLeft();
                int top = computeSurfaceLayoutArea.top - surfaceView.getTop();
                surfaceView.layout(computeSurfaceLayoutArea.left, computeSurfaceLayoutArea.top, computeSurfaceLayoutArea.right, computeSurfaceLayoutArea.bottom);
                if (z2) {
                    dispatchRevealEvent(computeSurfaceLayoutArea.left, computeSurfaceLayoutArea.top, computeSurfaceLayoutArea.right, computeSurfaceLayoutArea.bottom);
                    dispatchSwipeEvent(computeSurfaceLayoutArea.left, computeSurfaceLayoutArea.top, left, top);
                } else {
                    safeBottomView();
                }
            }
            invalidate();
        }
    }

    public void open(boolean z, boolean z2) {
        View surfaceView = getSurfaceView();
        View currentBottomView = getCurrentBottomView();
        if (surfaceView != null) {
            Rect computeSurfaceLayoutArea = computeSurfaceLayoutArea(true);
            if (z) {
                this.mDragHelper.mo42I(surfaceView, computeSurfaceLayoutArea.left, computeSurfaceLayoutArea.top);
            } else {
                int left = computeSurfaceLayoutArea.left - surfaceView.getLeft();
                int top = computeSurfaceLayoutArea.top - surfaceView.getTop();
                surfaceView.layout(computeSurfaceLayoutArea.left, computeSurfaceLayoutArea.top, computeSurfaceLayoutArea.right, computeSurfaceLayoutArea.bottom);
                ShowMode showMode = getShowMode();
                ShowMode showMode2 = ShowMode.PullOut;
                if (showMode == showMode2) {
                    Rect computeBottomLayoutAreaViaSurface = computeBottomLayoutAreaViaSurface(showMode2, computeSurfaceLayoutArea);
                    if (currentBottomView != null) {
                        currentBottomView.layout(computeBottomLayoutAreaViaSurface.left, computeBottomLayoutAreaViaSurface.top, computeBottomLayoutAreaViaSurface.right, computeBottomLayoutAreaViaSurface.bottom);
                    }
                }
                if (z2) {
                    dispatchRevealEvent(computeSurfaceLayoutArea.left, computeSurfaceLayoutArea.top, computeSurfaceLayoutArea.right, computeSurfaceLayoutArea.bottom);
                    dispatchSwipeEvent(computeSurfaceLayoutArea.left, computeSurfaceLayoutArea.top, left, top);
                } else {
                    safeBottomView();
                }
            }
            invalidate();
        }
    }

    public void setDrag(DragEdge dragEdge, View view) {
        clearDragEdge();
        addDrag(dragEdge, view);
    }

    /* access modifiers changed from: protected */
    public void dispatchSwipeEvent(int i, int i2, boolean z) {
        safeBottomView();
        Status openStatus = getOpenStatus();
        if (!this.mSwipeListeners.isEmpty()) {
            this.mEventCounter++;
            for (SwipeListener next : this.mSwipeListeners) {
                if (this.mEventCounter == 1) {
                    if (z) {
                        next.onStartOpen(this);
                    } else {
                        next.onStartClose(this);
                    }
                }
                next.onUpdate(this, i - getPaddingLeft(), i2 - getPaddingTop());
            }
            if (openStatus == Status.Close) {
                for (SwipeListener onClose : this.mSwipeListeners) {
                    onClose.onClose(this);
                }
                this.mEventCounter = 0;
            }
            if (openStatus == Status.Open) {
                View currentBottomView = getCurrentBottomView();
                if (currentBottomView != null) {
                    currentBottomView.setEnabled(true);
                }
                for (SwipeListener onOpen : this.mSwipeListeners) {
                    onOpen.onOpen(this);
                }
                this.mEventCounter = 0;
            }
        }
    }

    public void addRevealListener(int[] iArr, OnRevealListener onRevealListener) {
        for (int addRevealListener : iArr) {
            addRevealListener(addRevealListener, onRevealListener);
        }
    }

    @Deprecated
    public void setDragEdges(DragEdge... dragEdgeArr) {
        clearDragEdge();
        setDragEdges((List<DragEdge>) Arrays.asList(dragEdgeArr));
    }

    public void open(DragEdge dragEdge) {
        setCurrentDragEdge(dragEdge);
        open(true, true);
    }

    public void open(boolean z, DragEdge dragEdge) {
        setCurrentDragEdge(dragEdge);
        open(z, true);
    }

    public void open(boolean z, boolean z2, DragEdge dragEdge) {
        setCurrentDragEdge(dragEdge);
        open(z, z2);
    }
}
