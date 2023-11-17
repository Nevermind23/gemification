package p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.decoder.CompatDecoderFactory;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.decoder.DecoderFactory;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.decoder.ImageDecoder;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.decoder.ImageRegionDecoder;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.decoder.SkiaImageDecoder;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.decoder.SkiaImageRegionDecoder;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView */
public class SubsamplingScaleImageView extends View {
    public static final int EASE_IN_OUT_QUAD = 2;
    public static final int EASE_OUT_QUAD = 1;
    private static final int MESSAGE_LONG_CLICK = 1;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_USE_EXIF = -1;
    public static final int ORIGIN_ANIM = 1;
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = 4;
    public static final int ORIGIN_FLING = 3;
    public static final int ORIGIN_TOUCH = 2;
    public static final int PAN_LIMIT_CENTER = 3;
    public static final int PAN_LIMIT_INSIDE = 1;
    public static final int PAN_LIMIT_OUTSIDE = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 2;
    public static final int SCALE_TYPE_CENTER_INSIDE = 1;
    public static final int SCALE_TYPE_CUSTOM = 3;
    /* access modifiers changed from: private */
    public static final String TAG = "SubsamplingScaleImageView";
    public static int TILE_SIZE_AUTO = Integer.MAX_VALUE;
    /* access modifiers changed from: private */
    public static final List<Integer> VALID_EASING_STYLES = Arrays.asList(new Integer[]{2, 1});
    private static final List<Integer> VALID_ORIENTATIONS = Arrays.asList(new Integer[]{0, 90, Integer.valueOf(ORIENTATION_180), Integer.valueOf(ORIENTATION_270), -1});
    private static final List<Integer> VALID_PAN_LIMITS = Arrays.asList(new Integer[]{1, 2, 3});
    private static final List<Integer> VALID_SCALE_TYPES = Arrays.asList(new Integer[]{2, 1, 3});
    private static final List<Integer> VALID_ZOOM_STYLES = Arrays.asList(new Integer[]{1, 2, 3});
    public static final int ZOOM_FOCUS_CENTER = 2;
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = 3;
    public static final int ZOOM_FOCUS_FIXED = 1;
    /* access modifiers changed from: private */
    public C35796c anim;
    protected Bitmap bitmap;
    private DecoderFactory<? extends ImageDecoder> bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean debug;
    private Paint debugPaint;
    private ImageRegionDecoder decoder;
    /* access modifiers changed from: private */
    public final Object decoderLock;
    private float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration;
    private float doubleTapZoomScale;
    private int doubleTapZoomStyle;
    private float[] dstArray;
    private int fullImageSampleSize;
    private Handler handler;
    private boolean imageLoadedSent;
    protected ImageSource imageSource;
    private boolean isPanning;
    /* access modifiers changed from: private */
    public boolean isQuickScaling;
    /* access modifiers changed from: private */
    public boolean isZooming;
    private Matrix matrix;
    private float maxScale;
    private int maxTileHeight;
    private int maxTileWidth;
    /* access modifiers changed from: private */
    public int maxTouchCount;
    private float minScale;
    private int minimumScaleType;
    private int minimumTileDpi;
    /* access modifiers changed from: private */
    public OnImageEventListener onImageEventListener;
    /* access modifiers changed from: private */
    public View.OnLongClickListener onLongClickListener;
    private OnStateChangedListener onStateChangedListener;
    private int orientation;
    private Rect pRegion;
    /* access modifiers changed from: private */
    public boolean panEnabled;
    public int panLimit;
    private boolean parallelLoadingEnabled;
    private Float pendingScale;
    /* access modifiers changed from: private */
    public boolean quickScaleEnabled;
    /* access modifiers changed from: private */
    public float quickScaleLastDistance;
    /* access modifiers changed from: private */
    public boolean quickScaleMoved;
    /* access modifiers changed from: private */
    public PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    /* access modifiers changed from: private */
    public PointF quickScaleVLastPoint;
    /* access modifiers changed from: private */
    public PointF quickScaleVStart;
    /* access modifiers changed from: private */
    public boolean readySent;
    private DecoderFactory<? extends ImageRegionDecoder> regionDecoderFactory;
    private int sHeight;
    private int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    /* access modifiers changed from: private */
    public Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private ScaleAndTranslate satTemp;
    /* access modifiers changed from: private */
    public float scale;
    /* access modifiers changed from: private */
    public float scaleStart;
    private float[] srcArray;
    private Paint tileBgPaint;
    private Map<Integer, List<C35798e>> tileMap;
    private Uri uri;
    /* access modifiers changed from: private */
    public PointF vCenterStart;
    private float vDistStart;
    /* access modifiers changed from: private */
    public PointF vTranslate;
    private PointF vTranslateBefore;
    /* access modifiers changed from: private */
    public PointF vTranslateStart;
    /* access modifiers changed from: private */
    public boolean zoomEnabled;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$DefaultOnAnimationEventListener */
    public static class DefaultOnAnimationEventListener implements OnAnimationEventListener {
        public void onComplete() {
        }

        public void onInterruptedByNewAnim() {
        }

        public void onInterruptedByUser() {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$DefaultOnImageEventListener */
    public static class DefaultOnImageEventListener implements OnImageEventListener {
        public void onImageLoadError(Exception exc) {
        }

        public void onImageLoaded() {
        }

        public void onPreviewLoadError(Exception exc) {
        }

        public void onPreviewReleased() {
        }

        public void onReady() {
        }

        public void onTileLoadError(Exception exc) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$DefaultOnStateChangedListener */
    public static class DefaultOnStateChangedListener implements OnStateChangedListener {
        public void onCenterChanged(PointF pointF, int i) {
        }

        public void onScaleChanged(float f, int i) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$OnAnimationEventListener */
    public interface OnAnimationEventListener {
        void onComplete();

        void onInterruptedByNewAnim();

        void onInterruptedByUser();
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$OnImageEventListener */
    public interface OnImageEventListener {
        void onImageLoadError(Exception exc);

        void onImageLoaded();

        void onPreviewLoadError(Exception exc);

        void onPreviewReleased();

        void onReady();

        void onTileLoadError(Exception exc);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$OnStateChangedListener */
    public interface OnStateChangedListener {
        void onCenterChanged(PointF pointF, int i);

        void onScaleChanged(float f, int i);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$ScaleAndTranslate */
    public static class ScaleAndTranslate {
        public float scale;
        public PointF vTranslate;

        private ScaleAndTranslate(float f, PointF pointF) {
            this.scale = f;
            this.vTranslate = pointF;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$a */
    class C35794a implements Handler.Callback {
        C35794a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1 && SubsamplingScaleImageView.this.onLongClickListener != null) {
                SubsamplingScaleImageView.this.maxTouchCount = 0;
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.onLongClickListener);
                SubsamplingScaleImageView.this.performLongClick();
                SubsamplingScaleImageView.super.setOnLongClickListener((View.OnLongClickListener) null);
            }
            return true;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$b */
    class C35795b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        final /* synthetic */ Context f86474d;

        C35795b(Context context) {
            this.f86474d = context;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!SubsamplingScaleImageView.this.zoomEnabled || !SubsamplingScaleImageView.this.readySent || SubsamplingScaleImageView.this.vTranslate == null) {
                return super.onDoubleTapEvent(motionEvent);
            }
            SubsamplingScaleImageView.this.setGestureDetector(this.f86474d);
            if (SubsamplingScaleImageView.this.quickScaleEnabled) {
                SubsamplingScaleImageView.this.vCenterStart = new PointF(motionEvent.getX(), motionEvent.getY());
                SubsamplingScaleImageView.this.vTranslateStart = new PointF(SubsamplingScaleImageView.this.vTranslate.x, SubsamplingScaleImageView.this.vTranslate.y);
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                subsamplingScaleImageView.scaleStart = subsamplingScaleImageView.scale;
                SubsamplingScaleImageView.this.isQuickScaling = true;
                SubsamplingScaleImageView.this.isZooming = true;
                SubsamplingScaleImageView.this.quickScaleLastDistance = -1.0f;
                SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                subsamplingScaleImageView2.quickScaleSCenter = subsamplingScaleImageView2.viewToSourceCoord(subsamplingScaleImageView2.vCenterStart);
                SubsamplingScaleImageView.this.quickScaleVStart = new PointF(motionEvent.getX(), motionEvent.getY());
                SubsamplingScaleImageView.this.quickScaleVLastPoint = new PointF(SubsamplingScaleImageView.this.quickScaleSCenter.x, SubsamplingScaleImageView.this.quickScaleSCenter.y);
                SubsamplingScaleImageView.this.quickScaleMoved = false;
                return false;
            }
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView3.doubleTapZoom(subsamplingScaleImageView3.viewToSourceCoord(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!SubsamplingScaleImageView.this.panEnabled || !SubsamplingScaleImageView.this.readySent || SubsamplingScaleImageView.this.vTranslate == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.isZooming))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = new PointF(SubsamplingScaleImageView.this.vTranslate.x + (f * 0.25f), SubsamplingScaleImageView.this.vTranslate.y + (f2 * 0.25f));
            new AnimationBuilder(new PointF((((float) (SubsamplingScaleImageView.this.getWidth() / 2)) - pointF.x) / SubsamplingScaleImageView.this.scale, (((float) (SubsamplingScaleImageView.this.getHeight() / 2)) - pointF.y) / SubsamplingScaleImageView.this.scale)).withEasing(1).withPanLimited(false).withOrigin(3).start();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$c */
    private static class C35796c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public float f86476a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f86477b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public PointF f86478c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public PointF f86479d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public PointF f86480e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public PointF f86481f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public PointF f86482g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f86483h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f86484i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f86485j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f86486k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public long f86487l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public OnAnimationEventListener f86488m;

        private C35796c() {
            this.f86483h = 500;
            this.f86484i = true;
            this.f86485j = 2;
            this.f86486k = 1;
            this.f86487l = System.currentTimeMillis();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$d */
    private static class C35797d extends AsyncTask {

        /* renamed from: a */
        private final WeakReference f86489a;

        /* renamed from: b */
        private final WeakReference f86490b;

        /* renamed from: c */
        private final WeakReference f86491c;

        /* renamed from: d */
        private final Uri f86492d;

        /* renamed from: e */
        private final boolean f86493e;

        /* renamed from: f */
        private Bitmap f86494f;

        /* renamed from: g */
        private Exception f86495g;

        C35797d(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory decoderFactory, Uri uri, boolean z) {
            this.f86489a = new WeakReference(subsamplingScaleImageView);
            this.f86490b = new WeakReference(context);
            this.f86491c = new WeakReference(decoderFactory);
            this.f86492d = uri;
            this.f86493e = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            try {
                String uri = this.f86492d.toString();
                Context context = (Context) this.f86490b.get();
                DecoderFactory decoderFactory = (DecoderFactory) this.f86491c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f86489a.get();
                if (context == null || decoderFactory == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.debug("BitmapLoadTask.doInBackground", new Object[0]);
                this.f86494f = ((ImageDecoder) decoderFactory.make()).decode(context, this.f86492d);
                return Integer.valueOf(subsamplingScaleImageView.getExifOrientation(context, uri));
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to load bitmap", e);
                this.f86495g = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to load bitmap - OutOfMemoryError", e2);
                this.f86495g = new RuntimeException(e2);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f86489a.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f86494f;
                if (bitmap == null || num == null) {
                    if (this.f86495g != null && subsamplingScaleImageView.onImageEventListener != null) {
                        if (this.f86493e) {
                            subsamplingScaleImageView.onImageEventListener.onPreviewLoadError(this.f86495g);
                        } else {
                            subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.f86495g);
                        }
                    }
                } else if (this.f86493e) {
                    subsamplingScaleImageView.onPreviewLoaded(bitmap);
                } else {
                    subsamplingScaleImageView.onImageLoaded(bitmap, num.intValue(), false);
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$e */
    private static class C35798e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Rect f86496a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f86497b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Bitmap f86498c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f86499d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f86500e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Rect f86501f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Rect f86502g;

        private C35798e() {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$f */
    private static class C35799f extends AsyncTask {

        /* renamed from: a */
        private final WeakReference f86503a;

        /* renamed from: b */
        private final WeakReference f86504b;

        /* renamed from: c */
        private final WeakReference f86505c;

        /* renamed from: d */
        private Exception f86506d;

        C35799f(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, C35798e eVar) {
            this.f86503a = new WeakReference(subsamplingScaleImageView);
            this.f86504b = new WeakReference(imageRegionDecoder);
            this.f86505c = new WeakReference(eVar);
            eVar.f86499d = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            Bitmap decodeRegion;
            try {
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f86503a.get();
                ImageRegionDecoder imageRegionDecoder = (ImageRegionDecoder) this.f86504b.get();
                C35798e eVar = (C35798e) this.f86505c.get();
                if (imageRegionDecoder != null && eVar != null && subsamplingScaleImageView != null && imageRegionDecoder.isReady() && eVar.f86500e) {
                    subsamplingScaleImageView.debug("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", eVar.f86496a, Integer.valueOf(eVar.f86497b));
                    synchronized (subsamplingScaleImageView.decoderLock) {
                        subsamplingScaleImageView.fileSRect(eVar.f86496a, eVar.f86502g);
                        if (subsamplingScaleImageView.sRegion != null) {
                            eVar.f86502g.offset(subsamplingScaleImageView.sRegion.left, subsamplingScaleImageView.sRegion.top);
                        }
                        decodeRegion = imageRegionDecoder.decodeRegion(eVar.f86502g, eVar.f86497b);
                    }
                    return decodeRegion;
                } else if (eVar == null) {
                    return null;
                } else {
                    eVar.f86499d = false;
                    return null;
                }
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to decode tile", e);
                this.f86506d = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to decode tile - OutOfMemoryError", e2);
                this.f86506d = new RuntimeException(e2);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f86503a.get();
            C35798e eVar = (C35798e) this.f86505c.get();
            if (subsamplingScaleImageView != null && eVar != null) {
                if (bitmap != null) {
                    eVar.f86498c = bitmap;
                    eVar.f86499d = false;
                    subsamplingScaleImageView.onTileLoaded();
                } else if (this.f86506d != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onTileLoadError(this.f86506d);
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$g */
    private static class C35800g extends AsyncTask {

        /* renamed from: a */
        private final WeakReference f86507a;

        /* renamed from: b */
        private final WeakReference f86508b;

        /* renamed from: c */
        private final WeakReference f86509c;

        /* renamed from: d */
        private final Uri f86510d;

        /* renamed from: e */
        private ImageRegionDecoder f86511e;

        /* renamed from: f */
        private Exception f86512f;

        C35800g(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory decoderFactory, Uri uri) {
            this.f86507a = new WeakReference(subsamplingScaleImageView);
            this.f86508b = new WeakReference(context);
            this.f86509c = new WeakReference(decoderFactory);
            this.f86510d = uri;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int[] doInBackground(Void... voidArr) {
            try {
                String uri = this.f86510d.toString();
                Context context = (Context) this.f86508b.get();
                DecoderFactory decoderFactory = (DecoderFactory) this.f86509c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f86507a.get();
                if (context == null || decoderFactory == null || subsamplingScaleImageView == null) {
                    return null;
                }
                subsamplingScaleImageView.debug("TilesInitTask.doInBackground", new Object[0]);
                ImageRegionDecoder imageRegionDecoder = (ImageRegionDecoder) decoderFactory.make();
                this.f86511e = imageRegionDecoder;
                Point init = imageRegionDecoder.init(context, this.f86510d);
                int i = init.x;
                int i2 = init.y;
                int D = subsamplingScaleImageView.getExifOrientation(context, uri);
                if (subsamplingScaleImageView.sRegion != null) {
                    i = subsamplingScaleImageView.sRegion.width();
                    i2 = subsamplingScaleImageView.sRegion.height();
                }
                return new int[]{i, i2, D};
            } catch (Exception e) {
                Log.e(SubsamplingScaleImageView.TAG, "Failed to initialise bitmap decoder", e);
                this.f86512f = e;
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.f86507a.get();
            if (subsamplingScaleImageView != null) {
                ImageRegionDecoder imageRegionDecoder = this.f86511e;
                if (imageRegionDecoder != null && iArr != null && iArr.length == 3) {
                    subsamplingScaleImageView.onTilesInited(imageRegionDecoder, iArr[0], iArr[1], iArr[2]);
                } else if (this.f86512f != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.f86512f);
                }
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.orientation = 0;
        this.maxScale = 2.0f;
        this.minScale = minScale();
        this.minimumTileDpi = -1;
        this.panLimit = 1;
        this.minimumScaleType = 1;
        int i = TILE_SIZE_AUTO;
        this.maxTileWidth = i;
        this.maxTileHeight = i;
        this.panEnabled = true;
        this.zoomEnabled = true;
        this.quickScaleEnabled = true;
        this.doubleTapZoomScale = 1.0f;
        this.doubleTapZoomStyle = 1;
        this.doubleTapZoomDuration = 500;
        this.decoderLock = new Object();
        this.bitmapDecoderFactory = new CompatDecoderFactory(SkiaImageDecoder.class);
        this.regionDecoderFactory = new CompatDecoderFactory(SkiaImageRegionDecoder.class);
        this.srcArray = new float[8];
        this.dstArray = new float[8];
        this.density = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setGestureDetector(context);
        this.handler = new Handler(new C35794a());
        this.quickScaleThreshold = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    private int calculateInSampleSize(float f) {
        int i;
        if (this.minimumTileDpi > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= ((float) this.minimumTileDpi) / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int sWidth2 = (int) (((float) sWidth()) * f);
        int sHeight2 = (int) (((float) sHeight()) * f);
        if (sWidth2 == 0 || sHeight2 == 0) {
            return 32;
        }
        int i2 = 1;
        if (sHeight() > sHeight2 || sWidth() > sWidth2) {
            i = Math.round(((float) sHeight()) / ((float) sHeight2));
            int round = Math.round(((float) sWidth()) / ((float) sWidth2));
            if (i >= round) {
                i = round;
            }
        } else {
            i = 1;
        }
        while (true) {
            int i3 = i2 * 2;
            if (i3 >= i) {
                return i2;
            }
            i2 = i3;
        }
    }

    private boolean checkImageLoaded() {
        boolean isBaseLayerReady = isBaseLayerReady();
        if (!this.imageLoadedSent && isBaseLayerReady) {
            preDraw();
            this.imageLoadedSent = true;
            onImageLoaded();
            OnImageEventListener onImageEventListener2 = this.onImageEventListener;
            if (onImageEventListener2 != null) {
                onImageEventListener2.onImageLoaded();
            }
        }
        return isBaseLayerReady;
    }

    private boolean checkReady() {
        boolean z;
        if (getWidth() <= 0 || getHeight() <= 0 || this.sWidth <= 0 || this.sHeight <= 0 || (this.bitmap == null && !isBaseLayerReady())) {
            z = false;
        } else {
            z = true;
        }
        if (!this.readySent && z) {
            preDraw();
            this.readySent = true;
            onReady();
            OnImageEventListener onImageEventListener2 = this.onImageEventListener;
            if (onImageEventListener2 != null) {
                onImageEventListener2.onReady();
            }
        }
        return z;
    }

    private void createPaints() {
        if (this.bitmapPaint == null) {
            Paint paint = new Paint();
            this.bitmapPaint = paint;
            paint.setAntiAlias(true);
            this.bitmapPaint.setFilterBitmap(true);
            this.bitmapPaint.setDither(true);
        }
        if (this.debugPaint == null && this.debug) {
            Paint paint2 = new Paint();
            this.debugPaint = paint2;
            paint2.setTextSize(18.0f);
            this.debugPaint.setColor(-65281);
            this.debugPaint.setStyle(Paint.Style.STROKE);
        }
    }

    /* access modifiers changed from: private */
    public void debug(String str, Object... objArr) {
        if (this.debug) {
            Log.d(TAG, String.format(str, objArr));
        }
    }

    private float distance(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* access modifiers changed from: private */
    public void doubleTapZoom(PointF pointF, PointF pointF2) {
        boolean z;
        if (!this.panEnabled) {
            PointF pointF3 = this.sRequestedCenter;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = (float) (sWidth() / 2);
                pointF.y = (float) (sHeight() / 2);
            }
        }
        float min = Math.min(this.maxScale, this.doubleTapZoomScale);
        if (((double) this.scale) <= ((double) min) * 0.9d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            min = minScale();
        }
        float f = min;
        int i = this.doubleTapZoomStyle;
        if (i == 3) {
            setScaleAndCenter(f, pointF);
        } else if (i == 2 || !z || !this.panEnabled) {
            new AnimationBuilder(f, pointF).withInterruptible(false).withDuration((long) this.doubleTapZoomDuration).withOrigin(4).start();
        } else if (i == 1) {
            new AnimationBuilder(f, pointF, pointF2).withInterruptible(false).withDuration((long) this.doubleTapZoomDuration).withOrigin(4).start();
        }
        invalidate();
    }

    private float ease(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return easeOutQuad(j, f, f2, j2);
        }
        if (i == 2) {
            return easeInOutQuad(j, f, f2, j2);
        }
        throw new IllegalStateException("Unexpected easing type: " + i);
    }

    private float easeInOutQuad(long j, float f, float f2, long j2) {
        float f3;
        float f4 = ((float) j) / (((float) j2) / 2.0f);
        if (f4 < 1.0f) {
            f3 = (f2 / 2.0f) * f4;
        } else {
            float f5 = f4 - 1.0f;
            f3 = (-f2) / 2.0f;
            f4 = (f5 * (f5 - 2.0f)) - 1.0f;
        }
        return (f3 * f4) + f;
    }

    private float easeOutQuad(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    private void execute(AsyncTask<Void, Void, ?> asyncTask) {
        Class<AsyncTask> cls = AsyncTask.class;
        if (this.parallelLoadingEnabled) {
            try {
                cls.getMethod("executeOnExecutor", new Class[]{Executor.class, Object[].class}).invoke(asyncTask, new Object[]{(Executor) cls.getField("THREAD_POOL_EXECUTOR").get((Object) null), null});
                return;
            } catch (Exception e) {
                Log.i(TAG, "Failed to execute AsyncTask on thread pool executor, falling back to single threaded executor", e);
            }
        }
        asyncTask.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    public void fileSRect(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
        } else if (getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = this.sHeight;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
        } else if (getRequiredRotation() == 180) {
            int i3 = this.sWidth;
            int i4 = this.sHeight;
            rect2.set(i3 - rect.right, i4 - rect.bottom, i3 - rect.left, i4 - rect.top);
        } else {
            int i5 = this.sWidth;
            rect2.set(i5 - rect.bottom, rect.left, i5 - rect.top, rect.right);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        android.util.Log.w(TAG, "Could not get orientation of image from media store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r0 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getExifOrientation(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "content"
            boolean r0 = r11.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto L_0x006b
            r0 = 0
            java.lang.String r2 = "orientation"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x005b }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x005b }
            android.net.Uri r4 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x005b }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0052
            boolean r10 = r0.moveToFirst()     // Catch:{ Exception -> 0x005b }
            if (r10 == 0) goto L_0x0052
            int r10 = r0.getInt(r1)     // Catch:{ Exception -> 0x005b }
            java.util.List<java.lang.Integer> r11 = VALID_ORIENTATIONS     // Catch:{ Exception -> 0x005b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x005b }
            boolean r11 = r11.contains(r2)     // Catch:{ Exception -> 0x005b }
            if (r11 == 0) goto L_0x003c
            r11 = -1
            if (r10 == r11) goto L_0x003c
            r1 = r10
            goto L_0x0052
        L_0x003c:
            java.lang.String r11 = TAG     // Catch:{ Exception -> 0x005b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005b }
            r2.<init>()     // Catch:{ Exception -> 0x005b }
            java.lang.String r3 = "Unsupported orientation: "
            r2.append(r3)     // Catch:{ Exception -> 0x005b }
            r2.append(r10)     // Catch:{ Exception -> 0x005b }
            java.lang.String r10 = r2.toString()     // Catch:{ Exception -> 0x005b }
            android.util.Log.w(r11, r10)     // Catch:{ Exception -> 0x005b }
        L_0x0052:
            if (r0 == 0) goto L_0x00c3
        L_0x0054:
            r0.close()
            goto L_0x00c3
        L_0x0059:
            r10 = move-exception
            goto L_0x0065
        L_0x005b:
            java.lang.String r10 = TAG     // Catch:{ all -> 0x0059 }
            java.lang.String r11 = "Could not get orientation of image from media store"
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x00c3
            goto L_0x0054
        L_0x0065:
            if (r0 == 0) goto L_0x006a
            r0.close()
        L_0x006a:
            throw r10
        L_0x006b:
            java.lang.String r10 = "file:///"
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x00c3
            java.lang.String r10 = "file:///android_asset/"
            boolean r10 = r11.startsWith(r10)
            if (r10 != 0) goto L_0x00c3
            android.media.ExifInterface r10 = new android.media.ExifInterface     // Catch:{ Exception -> 0x00bc }
            r0 = 7
            java.lang.String r11 = r11.substring(r0)     // Catch:{ Exception -> 0x00bc }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r11 = "Orientation"
            r0 = 1
            int r10 = r10.getAttributeInt(r11, r0)     // Catch:{ Exception -> 0x00bc }
            if (r10 == r0) goto L_0x00c3
            if (r10 != 0) goto L_0x0091
            goto L_0x00c3
        L_0x0091:
            r11 = 6
            if (r10 != r11) goto L_0x0098
            r10 = 90
        L_0x0096:
            r1 = r10
            goto L_0x00c3
        L_0x0098:
            r11 = 3
            if (r10 != r11) goto L_0x009e
            r10 = 180(0xb4, float:2.52E-43)
            goto L_0x0096
        L_0x009e:
            r11 = 8
            if (r10 != r11) goto L_0x00a5
            r10 = 270(0x10e, float:3.78E-43)
            goto L_0x0096
        L_0x00a5:
            java.lang.String r11 = TAG     // Catch:{ Exception -> 0x00bc }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bc }
            r0.<init>()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r2 = "Unsupported EXIF orientation: "
            r0.append(r2)     // Catch:{ Exception -> 0x00bc }
            r0.append(r10)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x00bc }
            android.util.Log.w(r11, r10)     // Catch:{ Exception -> 0x00bc }
            goto L_0x00c3
        L_0x00bc:
            java.lang.String r10 = TAG
            java.lang.String r11 = "Could not get EXIF orientation of image"
            android.util.Log.w(r10, r11)
        L_0x00c3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView.getExifOrientation(android.content.Context, java.lang.String):int");
    }

    private Point getMaxBitmapDimensions(Canvas canvas) {
        int i;
        Class<Canvas> cls = Canvas.class;
        int i2 = C11398b.f33142u;
        try {
            i = ((Integer) cls.getMethod("getMaximumBitmapWidth", new Class[0]).invoke(canvas, new Object[0])).intValue();
            try {
                i2 = ((Integer) cls.getMethod("getMaximumBitmapHeight", new Class[0]).invoke(canvas, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            i = 2048;
        }
        return new Point(Math.min(i, this.maxTileWidth), Math.min(i2, this.maxTileHeight));
    }

    private int getRequiredRotation() {
        int i = this.orientation;
        if (i == -1) {
            return this.sOrientation;
        }
        return i;
    }

    private synchronized void initialiseBaseLayer(Point point) {
        debug("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        ScaleAndTranslate scaleAndTranslate = new ScaleAndTranslate(Utils.FLOAT_EPSILON, new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON));
        this.satTemp = scaleAndTranslate;
        fitToBounds(true, scaleAndTranslate);
        int calculateInSampleSize = calculateInSampleSize(this.satTemp.scale);
        this.fullImageSampleSize = calculateInSampleSize;
        if (calculateInSampleSize > 1) {
            this.fullImageSampleSize = calculateInSampleSize / 2;
        }
        if (this.fullImageSampleSize != 1 || this.sRegion != null || sWidth() >= point.x || sHeight() >= point.y) {
            initialiseTileMap(point);
            for (C35798e fVar : this.tileMap.get(Integer.valueOf(this.fullImageSampleSize))) {
                execute(new C35799f(this, this.decoder, fVar));
            }
            refreshRequiredTiles(true);
        } else {
            this.decoder.recycle();
            this.decoder = null;
            execute(new C35797d(this, getContext(), this.bitmapDecoderFactory, this.uri, false));
        }
    }

    private void initialiseTileMap(Point point) {
        boolean z;
        int i;
        int i2;
        Point point2 = point;
        boolean z2 = false;
        boolean z3 = true;
        debug("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point2.x), Integer.valueOf(point2.y));
        this.tileMap = new LinkedHashMap();
        int i3 = this.fullImageSampleSize;
        int i4 = 1;
        int i5 = 1;
        while (true) {
            int sWidth2 = sWidth() / i4;
            int sHeight2 = sHeight() / i5;
            int i6 = sWidth2 / i3;
            int i7 = sHeight2 / i3;
            while (true) {
                if (i6 + i4 + (z3 ? 1 : 0) > point2.x || (((double) i6) > ((double) getWidth()) * 1.25d && i3 < this.fullImageSampleSize)) {
                    boolean z4 = z3;
                    boolean z5 = z2;
                    boolean z6 = z4;
                    i4++;
                    sWidth2 = sWidth() / i4;
                    i6 = sWidth2 / i3;
                    boolean z7 = z5;
                    z3 = z6;
                    z2 = z7;
                }
            }
            while (true) {
                if (i7 + i5 + (z3 ? 1 : 0) > point2.y || (((double) i7) > ((double) getHeight()) * 1.25d && i3 < this.fullImageSampleSize)) {
                    boolean z8 = z3;
                    boolean z9 = z2;
                    boolean z12 = z8;
                    i5++;
                    sHeight2 = sHeight() / i5;
                    i7 = sHeight2 / i3;
                    boolean z13 = z9;
                    z3 = z12;
                    z2 = z13;
                }
            }
            ArrayList arrayList = new ArrayList(i4 * i5);
            int i8 = z2;
            while (i8 < i4) {
                int i9 = z2;
                while (i9 < i5) {
                    C35798e eVar = new C35798e();
                    eVar.f86497b = i3;
                    if (i3 == this.fullImageSampleSize) {
                        z = z3;
                    } else {
                        z = z2;
                    }
                    eVar.f86500e = z;
                    int i12 = i8 * sWidth2;
                    int i13 = i9 * sHeight2;
                    if (i8 == i4 - 1) {
                        i = sWidth();
                    } else {
                        i = (i8 + 1) * sWidth2;
                    }
                    if (i9 == i5 - 1) {
                        i2 = sHeight();
                    } else {
                        i2 = (i9 + 1) * sHeight2;
                    }
                    eVar.f86496a = new Rect(i12, i13, i, i2);
                    eVar.f86501f = new Rect(0, 0, 0, 0);
                    eVar.f86502g = new Rect(eVar.f86496a);
                    arrayList.add(eVar);
                    i9++;
                    z2 = false;
                    z3 = true;
                }
                boolean z14 = z2;
                i8++;
                z3 = true;
            }
            boolean z15 = z2;
            this.tileMap.put(Integer.valueOf(i3), arrayList);
            if (i3 != 1) {
                i3 /= 2;
                boolean z16 = z15;
                z3 = true;
                z2 = z16;
            } else {
                return;
            }
        }
    }

    private boolean isBaseLayerReady() {
        boolean z = true;
        if (this.bitmap != null && !this.bitmapIsPreview) {
            return true;
        }
        Map<Integer, List<C35798e>> map = this.tileMap;
        if (map == null) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (((Integer) next.getKey()).intValue() == this.fullImageSampleSize) {
                for (C35798e eVar : (List) next.getValue()) {
                    if (eVar.f86499d || eVar.f86498c == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    public PointF limitedSCenter(float f, float f2, float f3, PointF pointF) {
        PointF vTranslateForSCenter = vTranslateForSCenter(f, f2, f3);
        pointF.set((((float) (getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2))) - vTranslateForSCenter.x) / f3, (((float) (getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2))) - vTranslateForSCenter.y) / f3);
        return pointF;
    }

    private float minScale() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.minimumScaleType;
        if (i == 2) {
            return Math.max(((float) (getWidth() - paddingLeft)) / ((float) sWidth()), ((float) (getHeight() - paddingBottom)) / ((float) sHeight()));
        }
        if (i == 3) {
            float f = this.minScale;
            if (f > Utils.FLOAT_EPSILON) {
                return f;
            }
        }
        return Math.min(((float) (getWidth() - paddingLeft)) / ((float) sWidth()), ((float) (getHeight() - paddingBottom)) / ((float) sHeight()));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onPreviewLoaded(android.graphics.Bitmap r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "onPreviewLoaded"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0043 }
            r4.debug(r0, r1)     // Catch:{ all -> 0x0043 }
            android.graphics.Bitmap r0 = r4.bitmap     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x003e
            boolean r0 = r4.imageLoadedSent     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0012
            goto L_0x003e
        L_0x0012:
            android.graphics.Rect r0 = r4.pRegion     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x002b
            int r1 = r0.left     // Catch:{ all -> 0x0043 }
            int r2 = r0.top     // Catch:{ all -> 0x0043 }
            int r0 = r0.width()     // Catch:{ all -> 0x0043 }
            android.graphics.Rect r3 = r4.pRegion     // Catch:{ all -> 0x0043 }
            int r3 = r3.height()     // Catch:{ all -> 0x0043 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r1, r2, r0, r3)     // Catch:{ all -> 0x0043 }
            r4.bitmap = r5     // Catch:{ all -> 0x0043 }
            goto L_0x002d
        L_0x002b:
            r4.bitmap = r5     // Catch:{ all -> 0x0043 }
        L_0x002d:
            r5 = 1
            r4.bitmapIsPreview = r5     // Catch:{ all -> 0x0043 }
            boolean r5 = r4.checkReady()     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x003c
            r4.invalidate()     // Catch:{ all -> 0x0043 }
            r4.requestLayout()     // Catch:{ all -> 0x0043 }
        L_0x003c:
            monitor-exit(r4)
            return
        L_0x003e:
            r5.recycle()     // Catch:{ all -> 0x0043 }
            monitor-exit(r4)
            return
        L_0x0043:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView.onPreviewLoaded(android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: private */
    public synchronized void onTileLoaded() {
        Bitmap bitmap2;
        debug("onTileLoaded", new Object[0]);
        checkReady();
        checkImageLoaded();
        if (isBaseLayerReady() && (bitmap2 = this.bitmap) != null) {
            if (!this.bitmapIsCached) {
                bitmap2.recycle();
            }
            this.bitmap = null;
            OnImageEventListener onImageEventListener2 = this.onImageEventListener;
            if (onImageEventListener2 != null && this.bitmapIsCached) {
                onImageEventListener2.onPreviewReleased();
            }
            this.bitmapIsPreview = false;
            this.bitmapIsCached = false;
        }
        invalidate();
    }

    /* access modifiers changed from: private */
    public synchronized void onTilesInited(ImageRegionDecoder imageRegionDecoder, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        debug("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.orientation));
        int i8 = this.sWidth;
        if (i8 > 0 && (i7 = this.sHeight) > 0 && !(i8 == i && i7 == i2)) {
            reset(false);
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                if (!this.bitmapIsCached) {
                    bitmap2.recycle();
                }
                this.bitmap = null;
                OnImageEventListener onImageEventListener2 = this.onImageEventListener;
                if (onImageEventListener2 != null && this.bitmapIsCached) {
                    onImageEventListener2.onPreviewReleased();
                }
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            }
        }
        this.decoder = imageRegionDecoder;
        this.sWidth = i;
        this.sHeight = i2;
        this.sOrientation = i3;
        checkReady();
        if (!checkImageLoaded() && (i4 = this.maxTileWidth) > 0 && i4 != (i5 = TILE_SIZE_AUTO) && (i6 = this.maxTileHeight) > 0 && i6 != i5 && getWidth() > 0 && getHeight() > 0) {
            initialiseBaseLayer(new Point(this.maxTileWidth, this.maxTileHeight));
        }
        invalidate();
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 != 262) goto L_0x038a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0381  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean onTouchEventInternal(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r13.getAction()
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x03f7
            if (r1 == r5) goto L_0x038b
            if (r1 == r3) goto L_0x0023
            r6 = 5
            if (r1 == r6) goto L_0x03f7
            r6 = 6
            if (r1 == r6) goto L_0x038b
            r6 = 261(0x105, float:3.66E-43)
            if (r1 == r6) goto L_0x03f7
            r2 = 262(0x106, float:3.67E-43)
            if (r1 == r2) goto L_0x038b
            goto L_0x038a
        L_0x0023:
            int r1 = r12.maxTouchCount
            if (r1 <= 0) goto L_0x037e
            r1 = 1084227584(0x40a00000, float:5.0)
            if (r0 < r3) goto L_0x017d
            float r0 = r13.getX(r4)
            float r6 = r13.getX(r5)
            float r7 = r13.getY(r4)
            float r8 = r13.getY(r5)
            float r0 = r12.distance(r0, r6, r7, r8)
            float r6 = r13.getX(r4)
            float r7 = r13.getX(r5)
            float r6 = r6 + r7
            float r6 = r6 / r2
            float r7 = r13.getY(r4)
            float r13 = r13.getY(r5)
            float r7 = r7 + r13
            float r7 = r7 / r2
            boolean r13 = r12.zoomEnabled
            if (r13 == 0) goto L_0x037e
            android.graphics.PointF r13 = r12.vCenterStart
            float r2 = r13.x
            float r13 = r13.y
            float r13 = r12.distance(r2, r6, r13, r7)
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 > 0) goto L_0x0075
            float r13 = r12.vDistStart
            float r13 = r0 - r13
            float r13 = java.lang.Math.abs(r13)
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 > 0) goto L_0x0075
            boolean r13 = r12.isPanning
            if (r13 == 0) goto L_0x037e
        L_0x0075:
            r12.isZooming = r5
            r12.isPanning = r5
            float r13 = r12.scale
            double r1 = (double) r13
            float r13 = r12.maxScale
            float r8 = r12.vDistStart
            float r8 = r0 / r8
            float r9 = r12.scaleStart
            float r8 = r8 * r9
            float r13 = java.lang.Math.min(r13, r8)
            r12.scale = r13
            float r8 = r12.minScale()
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 > 0) goto L_0x00a9
            r12.vDistStart = r0
            float r13 = r12.minScale()
            r12.scaleStart = r13
            android.graphics.PointF r13 = r12.vCenterStart
            r13.set(r6, r7)
            android.graphics.PointF r13 = r12.vTranslateStart
            android.graphics.PointF r0 = r12.vTranslate
            r13.set(r0)
            goto L_0x0175
        L_0x00a9:
            boolean r13 = r12.panEnabled
            if (r13 == 0) goto L_0x0124
            android.graphics.PointF r13 = r12.vCenterStart
            float r3 = r13.x
            android.graphics.PointF r8 = r12.vTranslateStart
            float r9 = r8.x
            float r3 = r3 - r9
            float r13 = r13.y
            float r8 = r8.y
            float r13 = r13 - r8
            float r8 = r12.scale
            float r9 = r12.scaleStart
            float r10 = r8 / r9
            float r3 = r3 * r10
            float r8 = r8 / r9
            float r13 = r13 * r8
            android.graphics.PointF r8 = r12.vTranslate
            float r3 = r6 - r3
            r8.x = r3
            float r13 = r7 - r13
            r8.y = r13
            int r13 = r12.sHeight()
            double r8 = (double) r13
            double r8 = r8 * r1
            int r13 = r12.getHeight()
            double r10 = (double) r13
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x00ee
            float r13 = r12.scale
            int r3 = r12.sHeight()
            float r3 = (float) r3
            float r13 = r13 * r3
            int r3 = r12.getHeight()
            float r3 = (float) r3
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x010e
        L_0x00ee:
            int r13 = r12.sWidth()
            double r8 = (double) r13
            double r1 = r1 * r8
            int r13 = r12.getWidth()
            double r8 = (double) r13
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x0175
            float r13 = r12.scale
            int r1 = r12.sWidth()
            float r1 = (float) r1
            float r13 = r13 * r1
            int r1 = r12.getWidth()
            float r1 = (float) r1
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 < 0) goto L_0x0175
        L_0x010e:
            r12.fitToBounds(r5)
            android.graphics.PointF r13 = r12.vCenterStart
            r13.set(r6, r7)
            android.graphics.PointF r13 = r12.vTranslateStart
            android.graphics.PointF r1 = r12.vTranslate
            r13.set(r1)
            float r13 = r12.scale
            r12.scaleStart = r13
            r12.vDistStart = r0
            goto L_0x0175
        L_0x0124:
            android.graphics.PointF r13 = r12.sRequestedCenter
            if (r13 == 0) goto L_0x014d
            android.graphics.PointF r13 = r12.vTranslate
            int r0 = r12.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            float r1 = r12.scale
            android.graphics.PointF r2 = r12.sRequestedCenter
            float r2 = r2.x
            float r1 = r1 * r2
            float r0 = r0 - r1
            r13.x = r0
            android.graphics.PointF r13 = r12.vTranslate
            int r0 = r12.getHeight()
            int r0 = r0 / r3
            float r0 = (float) r0
            float r1 = r12.scale
            android.graphics.PointF r2 = r12.sRequestedCenter
            float r2 = r2.y
            float r1 = r1 * r2
            float r0 = r0 - r1
            r13.y = r0
            goto L_0x0175
        L_0x014d:
            android.graphics.PointF r13 = r12.vTranslate
            int r0 = r12.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            float r1 = r12.scale
            int r2 = r12.sWidth()
            int r2 = r2 / r3
            float r2 = (float) r2
            float r1 = r1 * r2
            float r0 = r0 - r1
            r13.x = r0
            android.graphics.PointF r13 = r12.vTranslate
            int r0 = r12.getHeight()
            int r0 = r0 / r3
            float r0 = (float) r0
            float r1 = r12.scale
            int r2 = r12.sHeight()
            int r2 = r2 / r3
            float r2 = (float) r2
            float r1 = r1 * r2
            float r0 = r0 - r1
            r13.y = r0
        L_0x0175:
            r12.fitToBounds(r5)
            r12.refreshRequiredTiles(r4)
            goto L_0x02c8
        L_0x017d:
            boolean r0 = r12.isQuickScaling
            if (r0 == 0) goto L_0x02cb
            android.graphics.PointF r0 = r12.quickScaleVStart
            float r0 = r0.y
            float r1 = r13.getY()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 * r2
            float r1 = r12.quickScaleThreshold
            float r0 = r0 + r1
            float r1 = r12.quickScaleLastDistance
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x019c
            r12.quickScaleLastDistance = r0
        L_0x019c:
            float r1 = r13.getY()
            android.graphics.PointF r2 = r12.quickScaleVLastPoint
            float r6 = r2.y
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x01aa
            r1 = r5
            goto L_0x01ab
        L_0x01aa:
            r1 = r4
        L_0x01ab:
            float r13 = r13.getY()
            r6 = 0
            r2.set(r6, r13)
            float r13 = r12.quickScaleLastDistance
            float r13 = r0 / r13
            r2 = 1065353216(0x3f800000, float:1.0)
            float r13 = r2 - r13
            float r13 = java.lang.Math.abs(r13)
            r7 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 * r7
            r7 = 1022739087(0x3cf5c28f, float:0.03)
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x01cd
            boolean r7 = r12.quickScaleMoved
            if (r7 == 0) goto L_0x02c0
        L_0x01cd:
            r12.quickScaleMoved = r5
            float r7 = r12.quickScaleLastDistance
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x01db
            if (r1 == 0) goto L_0x01da
            float r13 = r13 + r2
            r2 = r13
            goto L_0x01db
        L_0x01da:
            float r2 = r2 - r13
        L_0x01db:
            float r13 = r12.scale
            double r7 = (double) r13
            float r13 = r12.minScale()
            float r1 = r12.maxScale
            float r9 = r12.scale
            float r9 = r9 * r2
            float r1 = java.lang.Math.min(r1, r9)
            float r13 = java.lang.Math.max(r13, r1)
            r12.scale = r13
            boolean r1 = r12.panEnabled
            if (r1 == 0) goto L_0x026f
            android.graphics.PointF r1 = r12.vCenterStart
            float r2 = r1.x
            android.graphics.PointF r3 = r12.vTranslateStart
            float r9 = r3.x
            float r9 = r2 - r9
            float r1 = r1.y
            float r3 = r3.y
            float r3 = r1 - r3
            float r10 = r12.scaleStart
            float r11 = r13 / r10
            float r9 = r9 * r11
            float r13 = r13 / r10
            float r3 = r3 * r13
            android.graphics.PointF r13 = r12.vTranslate
            float r2 = r2 - r9
            r13.x = r2
            float r1 = r1 - r3
            r13.y = r1
            int r13 = r12.sHeight()
            double r1 = (double) r13
            double r1 = r1 * r7
            int r13 = r12.getHeight()
            double r9 = (double) r13
            int r13 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0234
            float r13 = r12.scale
            int r1 = r12.sHeight()
            float r1 = (float) r1
            float r13 = r13 * r1
            int r1 = r12.getHeight()
            float r1 = (float) r1
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 >= 0) goto L_0x0254
        L_0x0234:
            int r13 = r12.sWidth()
            double r1 = (double) r13
            double r7 = r7 * r1
            int r13 = r12.getWidth()
            double r1 = (double) r13
            int r13 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r13 >= 0) goto L_0x02c0
            float r13 = r12.scale
            int r1 = r12.sWidth()
            float r1 = (float) r1
            float r13 = r13 * r1
            int r1 = r12.getWidth()
            float r1 = (float) r1
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 < 0) goto L_0x02c0
        L_0x0254:
            r12.fitToBounds(r5)
            android.graphics.PointF r13 = r12.vCenterStart
            android.graphics.PointF r0 = r12.quickScaleSCenter
            android.graphics.PointF r0 = r12.sourceToViewCoord(r0)
            r13.set(r0)
            android.graphics.PointF r13 = r12.vTranslateStart
            android.graphics.PointF r0 = r12.vTranslate
            r13.set(r0)
            float r13 = r12.scale
            r12.scaleStart = r13
            r0 = r6
            goto L_0x02c0
        L_0x026f:
            android.graphics.PointF r13 = r12.sRequestedCenter
            if (r13 == 0) goto L_0x0298
            android.graphics.PointF r13 = r12.vTranslate
            int r1 = r12.getWidth()
            int r1 = r1 / r3
            float r1 = (float) r1
            float r2 = r12.scale
            android.graphics.PointF r6 = r12.sRequestedCenter
            float r6 = r6.x
            float r2 = r2 * r6
            float r1 = r1 - r2
            r13.x = r1
            android.graphics.PointF r13 = r12.vTranslate
            int r1 = r12.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            float r2 = r12.scale
            android.graphics.PointF r3 = r12.sRequestedCenter
            float r3 = r3.y
            float r2 = r2 * r3
            float r1 = r1 - r2
            r13.y = r1
            goto L_0x02c0
        L_0x0298:
            android.graphics.PointF r13 = r12.vTranslate
            int r1 = r12.getWidth()
            int r1 = r1 / r3
            float r1 = (float) r1
            float r2 = r12.scale
            int r6 = r12.sWidth()
            int r6 = r6 / r3
            float r6 = (float) r6
            float r2 = r2 * r6
            float r1 = r1 - r2
            r13.x = r1
            android.graphics.PointF r13 = r12.vTranslate
            int r1 = r12.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            float r2 = r12.scale
            int r6 = r12.sHeight()
            int r6 = r6 / r3
            float r3 = (float) r6
            float r2 = r2 * r3
            float r1 = r1 - r2
            r13.y = r1
        L_0x02c0:
            r12.quickScaleLastDistance = r0
            r12.fitToBounds(r5)
            r12.refreshRequiredTiles(r4)
        L_0x02c8:
            r13 = r5
            goto L_0x037f
        L_0x02cb:
            boolean r0 = r12.isZooming
            if (r0 != 0) goto L_0x037e
            float r0 = r13.getX()
            android.graphics.PointF r2 = r12.vCenterStart
            float r2 = r2.x
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = r13.getY()
            android.graphics.PointF r3 = r12.vCenterStart
            float r3 = r3.y
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            float r3 = r12.density
            float r3 = r3 * r1
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x02f8
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x02f8
            boolean r6 = r12.isPanning
            if (r6 == 0) goto L_0x037e
        L_0x02f8:
            android.graphics.PointF r6 = r12.vTranslate
            android.graphics.PointF r7 = r12.vTranslateStart
            float r7 = r7.x
            float r8 = r13.getX()
            android.graphics.PointF r9 = r12.vCenterStart
            float r9 = r9.x
            float r8 = r8 - r9
            float r7 = r7 + r8
            r6.x = r7
            android.graphics.PointF r6 = r12.vTranslate
            android.graphics.PointF r7 = r12.vTranslateStart
            float r7 = r7.y
            float r13 = r13.getY()
            android.graphics.PointF r8 = r12.vCenterStart
            float r8 = r8.y
            float r13 = r13 - r8
            float r7 = r7 + r13
            r6.y = r7
            android.graphics.PointF r13 = r12.vTranslate
            float r6 = r13.x
            float r13 = r13.y
            r12.fitToBounds(r5)
            android.graphics.PointF r7 = r12.vTranslate
            float r8 = r7.x
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x032f
            r6 = r5
            goto L_0x0330
        L_0x032f:
            r6 = r4
        L_0x0330:
            if (r6 == 0) goto L_0x033c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x033c
            boolean r0 = r12.isPanning
            if (r0 != 0) goto L_0x033c
            r0 = r5
            goto L_0x033d
        L_0x033c:
            r0 = r4
        L_0x033d:
            float r7 = r7.y
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x034c
            r13 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 * r13
            int r13 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x034c
            r13 = r5
            goto L_0x034d
        L_0x034c:
            r13 = r4
        L_0x034d:
            if (r0 != 0) goto L_0x035a
            if (r6 == 0) goto L_0x0357
            if (r13 != 0) goto L_0x0357
            boolean r13 = r12.isPanning
            if (r13 == 0) goto L_0x035a
        L_0x0357:
            r12.isPanning = r5
            goto L_0x0366
        L_0x035a:
            if (r1 <= 0) goto L_0x0366
            r12.maxTouchCount = r4
            android.os.Handler r13 = r12.handler
            r13.removeMessages(r5)
            r12.requestDisallowInterceptTouchEvent(r4)
        L_0x0366:
            boolean r13 = r12.panEnabled
            if (r13 != 0) goto L_0x0379
            android.graphics.PointF r13 = r12.vTranslate
            android.graphics.PointF r0 = r12.vTranslateStart
            float r1 = r0.x
            r13.x = r1
            float r0 = r0.y
            r13.y = r0
            r12.requestDisallowInterceptTouchEvent(r4)
        L_0x0379:
            r12.refreshRequiredTiles(r4)
            goto L_0x02c8
        L_0x037e:
            r13 = r4
        L_0x037f:
            if (r13 == 0) goto L_0x038a
            android.os.Handler r13 = r12.handler
            r13.removeMessages(r5)
            r12.invalidate()
            return r5
        L_0x038a:
            return r4
        L_0x038b:
            android.os.Handler r1 = r12.handler
            r1.removeMessages(r5)
            boolean r1 = r12.isQuickScaling
            if (r1 == 0) goto L_0x03a1
            r12.isQuickScaling = r4
            boolean r1 = r12.quickScaleMoved
            if (r1 != 0) goto L_0x03a1
            android.graphics.PointF r1 = r12.quickScaleSCenter
            android.graphics.PointF r2 = r12.vCenterStart
            r12.doubleTapZoom(r1, r2)
        L_0x03a1:
            int r1 = r12.maxTouchCount
            if (r1 <= 0) goto L_0x03ee
            boolean r1 = r12.isZooming
            if (r1 != 0) goto L_0x03ad
            boolean r2 = r12.isPanning
            if (r2 == 0) goto L_0x03ee
        L_0x03ad:
            if (r1 == 0) goto L_0x03df
            if (r0 != r3) goto L_0x03df
            r12.isPanning = r5
            android.graphics.PointF r1 = r12.vTranslateStart
            android.graphics.PointF r2 = r12.vTranslate
            float r6 = r2.x
            float r2 = r2.y
            r1.set(r6, r2)
            int r1 = r13.getActionIndex()
            if (r1 != r5) goto L_0x03d2
            android.graphics.PointF r1 = r12.vCenterStart
            float r2 = r13.getX(r4)
            float r13 = r13.getY(r4)
            r1.set(r2, r13)
            goto L_0x03df
        L_0x03d2:
            android.graphics.PointF r1 = r12.vCenterStart
            float r2 = r13.getX(r5)
            float r13 = r13.getY(r5)
            r1.set(r2, r13)
        L_0x03df:
            r13 = 3
            if (r0 >= r13) goto L_0x03e4
            r12.isZooming = r4
        L_0x03e4:
            if (r0 >= r3) goto L_0x03ea
            r12.isPanning = r4
            r12.maxTouchCount = r4
        L_0x03ea:
            r12.refreshRequiredTiles(r5)
            return r5
        L_0x03ee:
            if (r0 != r5) goto L_0x03f6
            r12.isZooming = r4
            r12.isPanning = r4
            r12.maxTouchCount = r4
        L_0x03f6:
            return r5
        L_0x03f7:
            r1 = 0
            r12.anim = r1
            r12.requestDisallowInterceptTouchEvent(r5)
            int r1 = r12.maxTouchCount
            int r1 = java.lang.Math.max(r1, r0)
            r12.maxTouchCount = r1
            if (r0 < r3) goto L_0x0452
            boolean r0 = r12.zoomEnabled
            if (r0 == 0) goto L_0x044a
            float r0 = r13.getX(r4)
            float r1 = r13.getX(r5)
            float r3 = r13.getY(r4)
            float r6 = r13.getY(r5)
            float r0 = r12.distance(r0, r1, r3, r6)
            float r1 = r12.scale
            r12.scaleStart = r1
            r12.vDistStart = r0
            android.graphics.PointF r0 = r12.vTranslateStart
            android.graphics.PointF r1 = r12.vTranslate
            float r3 = r1.x
            float r1 = r1.y
            r0.set(r3, r1)
            android.graphics.PointF r0 = r12.vCenterStart
            float r1 = r13.getX(r4)
            float r3 = r13.getX(r5)
            float r1 = r1 + r3
            float r1 = r1 / r2
            float r3 = r13.getY(r4)
            float r13 = r13.getY(r5)
            float r3 = r3 + r13
            float r3 = r3 / r2
            r0.set(r1, r3)
            goto L_0x044c
        L_0x044a:
            r12.maxTouchCount = r4
        L_0x044c:
            android.os.Handler r13 = r12.handler
            r13.removeMessages(r5)
            goto L_0x0475
        L_0x0452:
            boolean r0 = r12.isQuickScaling
            if (r0 != 0) goto L_0x0475
            android.graphics.PointF r0 = r12.vTranslateStart
            android.graphics.PointF r1 = r12.vTranslate
            float r2 = r1.x
            float r1 = r1.y
            r0.set(r2, r1)
            android.graphics.PointF r0 = r12.vCenterStart
            float r1 = r13.getX()
            float r13 = r13.getY()
            r0.set(r1, r13)
            android.os.Handler r13 = r12.handler
            r0 = 600(0x258, double:2.964E-321)
            r13.sendEmptyMessageDelayed(r5, r0)
        L_0x0475:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView.onTouchEventInternal(android.view.MotionEvent):boolean");
    }

    private void preDraw() {
        Float f;
        if (getWidth() != 0 && getHeight() != 0 && this.sWidth > 0 && this.sHeight > 0) {
            if (!(this.sPendingCenter == null || (f = this.pendingScale) == null)) {
                this.scale = f.floatValue();
                if (this.vTranslate == null) {
                    this.vTranslate = new PointF();
                }
                this.vTranslate.x = ((float) (getWidth() / 2)) - (this.scale * this.sPendingCenter.x);
                this.vTranslate.y = ((float) (getHeight() / 2)) - (this.scale * this.sPendingCenter.y);
                this.sPendingCenter = null;
                this.pendingScale = null;
                fitToBounds(true);
                refreshRequiredTiles(true);
            }
            fitToBounds(false);
        }
    }

    private void refreshRequiredTiles(boolean z) {
        if (this.decoder != null && this.tileMap != null) {
            int min = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
            for (Map.Entry<Integer, List<C35798e>> value : this.tileMap.entrySet()) {
                for (C35798e eVar : (List) value.getValue()) {
                    if (eVar.f86497b < min || (eVar.f86497b > min && eVar.f86497b != this.fullImageSampleSize)) {
                        eVar.f86500e = false;
                        if (eVar.f86498c != null) {
                            eVar.f86498c.recycle();
                            eVar.f86498c = null;
                        }
                    }
                    if (eVar.f86497b == min) {
                        if (tileVisible(eVar)) {
                            eVar.f86500e = true;
                            if (!eVar.f86499d && eVar.f86498c == null && z) {
                                execute(new C35799f(this, this.decoder, eVar));
                            }
                        } else if (eVar.f86497b != this.fullImageSampleSize) {
                            eVar.f86500e = false;
                            if (eVar.f86498c != null) {
                                eVar.f86498c.recycle();
                                eVar.f86498c = null;
                            }
                        }
                    } else if (eVar.f86497b == this.fullImageSampleSize) {
                        eVar.f86500e = true;
                    }
                }
            }
        }
    }

    private void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void reset(boolean z) {
        OnImageEventListener onImageEventListener2;
        debug("reset newImage=" + z, new Object[0]);
        this.scale = Utils.FLOAT_EPSILON;
        this.scaleStart = Utils.FLOAT_EPSILON;
        this.vTranslate = null;
        this.vTranslateStart = null;
        this.vTranslateBefore = null;
        this.pendingScale = Float.valueOf(Utils.FLOAT_EPSILON);
        this.sPendingCenter = null;
        this.sRequestedCenter = null;
        this.isZooming = false;
        this.isPanning = false;
        this.isQuickScaling = false;
        this.maxTouchCount = 0;
        this.fullImageSampleSize = 0;
        this.vCenterStart = null;
        this.vDistStart = Utils.FLOAT_EPSILON;
        this.quickScaleLastDistance = Utils.FLOAT_EPSILON;
        this.quickScaleMoved = false;
        this.quickScaleSCenter = null;
        this.quickScaleVLastPoint = null;
        this.quickScaleVStart = null;
        this.anim = null;
        this.satTemp = null;
        this.matrix = null;
        this.sRect = null;
        if (z) {
            this.uri = null;
            if (this.decoder != null) {
                synchronized (this.decoderLock) {
                    this.decoder.recycle();
                    this.decoder = null;
                }
            }
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null && !this.bitmapIsCached) {
                bitmap2.recycle();
            }
            if (!(this.bitmap == null || !this.bitmapIsCached || (onImageEventListener2 = this.onImageEventListener) == null)) {
                onImageEventListener2.onPreviewReleased();
            }
            this.sWidth = 0;
            this.sHeight = 0;
            this.sOrientation = 0;
            this.sRegion = null;
            this.pRegion = null;
            this.readySent = false;
            this.imageLoadedSent = false;
            this.bitmap = null;
            this.bitmapIsPreview = false;
            this.bitmapIsCached = false;
        }
        Map<Integer, List<C35798e>> map = this.tileMap;
        if (map != null) {
            for (Map.Entry<Integer, List<C35798e>> value : map.entrySet()) {
                for (C35798e eVar : (List) value.getValue()) {
                    eVar.f86500e = false;
                    if (eVar.f86498c != null) {
                        eVar.f86498c.recycle();
                        eVar.f86498c = null;
                    }
                }
            }
            this.tileMap = null;
        }
        setGestureDetector(getContext());
    }

    private void restoreState(ImageViewState imageViewState) {
        if (imageViewState != null && imageViewState.getCenter() != null && VALID_ORIENTATIONS.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            this.orientation = imageViewState.getOrientation();
            this.pendingScale = Float.valueOf(imageViewState.getScale());
            this.sPendingCenter = imageViewState.getCenter();
            invalidate();
        }
    }

    private void sendStateChanged(float f, PointF pointF, int i) {
        OnStateChangedListener onStateChangedListener2 = this.onStateChangedListener;
        if (onStateChangedListener2 != null) {
            float f2 = this.scale;
            if (f2 != f) {
                onStateChangedListener2.onScaleChanged(f2, i);
            }
            if (!this.vTranslate.equals(pointF)) {
                this.onStateChangedListener.onCenterChanged(getCenter(), i);
            }
        }
    }

    /* access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.detector = new GestureDetector(context, new C35795b(context));
    }

    private void setMatrixArray(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    private Rect sourceToViewRect(Rect rect, Rect rect2) {
        rect2.set((int) sourceToViewX((float) rect.left), (int) sourceToViewY((float) rect.top), (int) sourceToViewX((float) rect.right), (int) sourceToViewY((float) rect.bottom));
        return rect2;
    }

    private float sourceToViewX(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.scale) + pointF.x;
    }

    private float sourceToViewY(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.scale) + pointF.y;
    }

    private boolean tileVisible(C35798e eVar) {
        float viewToSourceX = viewToSourceX(Utils.FLOAT_EPSILON);
        float viewToSourceX2 = viewToSourceX((float) getWidth());
        float viewToSourceY = viewToSourceY(Utils.FLOAT_EPSILON);
        float viewToSourceY2 = viewToSourceY((float) getHeight());
        if (viewToSourceX > ((float) eVar.f86496a.right) || ((float) eVar.f86496a.left) > viewToSourceX2 || viewToSourceY > ((float) eVar.f86496a.bottom) || ((float) eVar.f86496a.top) > viewToSourceY2) {
            return false;
        }
        return true;
    }

    private PointF vTranslateForSCenter(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(Utils.FLOAT_EPSILON, new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON));
        }
        ScaleAndTranslate scaleAndTranslate = this.satTemp;
        scaleAndTranslate.scale = f3;
        scaleAndTranslate.vTranslate.set(((float) paddingLeft) - (f * f3), ((float) paddingTop) - (f2 * f3));
        fitToBounds(true, this.satTemp);
        return this.satTemp.vTranslate;
    }

    private float viewToSourceX(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.scale;
    }

    private float viewToSourceY(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.scale;
    }

    public AnimationBuilder animateCenter(PointF pointF) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(pointF);
    }

    public AnimationBuilder animateScale(float f) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(f);
    }

    public AnimationBuilder animateScaleAndCenter(float f, PointF pointF) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(f, pointF);
    }

    /* access modifiers changed from: protected */
    public void fitToBounds(boolean z, ScaleAndTranslate scaleAndTranslate) {
        float f;
        float f2;
        int i;
        if (this.panLimit == 2 && isReady()) {
            z = false;
        }
        PointF pointF = scaleAndTranslate.vTranslate;
        float limitedScale = limitedScale(scaleAndTranslate.scale);
        float sWidth2 = ((float) sWidth()) * limitedScale;
        float sHeight2 = ((float) sHeight()) * limitedScale;
        if (this.panLimit == 3 && isReady()) {
            pointF.x = Math.max(pointF.x, ((float) (getWidth() / 2)) - sWidth2);
            pointF.y = Math.max(pointF.y, ((float) (getHeight() / 2)) - sHeight2);
        } else if (z) {
            pointF.x = Math.max(pointF.x, ((float) getWidth()) - sWidth2);
            pointF.y = Math.max(pointF.y, ((float) getHeight()) - sHeight2);
        } else {
            pointF.x = Math.max(pointF.x, -sWidth2);
            pointF.y = Math.max(pointF.y, -sHeight2);
        }
        float f3 = 0.5f;
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? ((float) getPaddingLeft()) / ((float) (getPaddingLeft() + getPaddingRight())) : 0.5f;
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            f3 = ((float) getPaddingTop()) / ((float) (getPaddingTop() + getPaddingBottom()));
        }
        if (this.panLimit == 3 && isReady()) {
            f = (float) Math.max(0, getWidth() / 2);
            i = Math.max(0, getHeight() / 2);
        } else if (z) {
            f = Math.max(Utils.FLOAT_EPSILON, (((float) getWidth()) - sWidth2) * paddingLeft);
            f2 = Math.max(Utils.FLOAT_EPSILON, (((float) getHeight()) - sHeight2) * f3);
            pointF.x = Math.min(pointF.x, f);
            pointF.y = Math.min(pointF.y, f2);
            scaleAndTranslate.scale = limitedScale;
        } else {
            f = (float) Math.max(0, getWidth());
            i = Math.max(0, getHeight());
        }
        f2 = (float) i;
        pointF.x = Math.min(pointF.x, f);
        pointF.y = Math.min(pointF.y, f2);
        scaleAndTranslate.scale = limitedScale;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public final PointF getCenter() {
        return viewToSourceCoord((float) (getWidth() / 2), (float) (getHeight() / 2));
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public final float getMinScale() {
        return minScale();
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final float getScale() {
        return this.scale;
    }

    public final ImageViewState getState() {
        if (this.vTranslate == null || this.sWidth <= 0 || this.sHeight <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    public boolean hasImage() {
        return (this.uri == null && this.bitmap == null) ? false : true;
    }

    public final boolean isImageLoaded() {
        return this.imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        return this.panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        return this.quickScaleEnabled;
    }

    public final boolean isReady() {
        return this.readySent;
    }

    public final boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    public float limitedScale(float f) {
        return Math.min(this.maxScale, Math.max(minScale(), f));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        createPaints();
        if (this.sWidth != 0 && this.sHeight != 0 && getWidth() != 0 && getHeight() != 0) {
            if (this.tileMap == null && this.decoder != null) {
                initialiseBaseLayer(getMaxBitmapDimensions(canvas));
            }
            if (checkReady()) {
                preDraw();
                if (this.anim != null) {
                    float f2 = this.scale;
                    if (this.vTranslateBefore == null) {
                        this.vTranslateBefore = new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                    }
                    this.vTranslateBefore.set(this.vTranslate);
                    long currentTimeMillis = System.currentTimeMillis() - this.anim.f86487l;
                    if (currentTimeMillis > this.anim.f86483h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long min = Math.min(currentTimeMillis, this.anim.f86483h);
                    this.scale = ease(this.anim.f86485j, min, this.anim.f86476a, this.anim.f86477b - this.anim.f86476a, this.anim.f86483h);
                    float ease = ease(this.anim.f86485j, min, this.anim.f86481f.x, this.anim.f86482g.x - this.anim.f86481f.x, this.anim.f86483h);
                    float ease2 = ease(this.anim.f86485j, min, this.anim.f86481f.y, this.anim.f86482g.y - this.anim.f86481f.y, this.anim.f86483h);
                    this.vTranslate.x -= sourceToViewX(this.anim.f86479d.x) - ease;
                    this.vTranslate.y -= sourceToViewY(this.anim.f86479d.y) - ease2;
                    if (z || this.anim.f86476a == this.anim.f86477b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    fitToBounds(z2);
                    sendStateChanged(f2, this.vTranslateBefore, this.anim.f86486k);
                    refreshRequiredTiles(z);
                    if (z) {
                        if (this.anim.f86488m != null) {
                            try {
                                this.anim.f86488m.onComplete();
                            } catch (Exception e) {
                                Log.w(TAG, "Error thrown by animation listener", e);
                            }
                        }
                        this.anim = null;
                    }
                    invalidate();
                }
                Map<Integer, List<C35798e>> map = this.tileMap;
                int i5 = 90;
                int i6 = ORIENTATION_180;
                if (map == null || !isBaseLayerReady()) {
                    Bitmap bitmap2 = this.bitmap;
                    if (bitmap2 != null) {
                        float f3 = this.scale;
                        if (this.bitmapIsPreview) {
                            f3 *= ((float) this.sWidth) / ((float) bitmap2.getWidth());
                            f = this.scale * (((float) this.sHeight) / ((float) this.bitmap.getHeight()));
                        } else {
                            f = f3;
                        }
                        if (this.matrix == null) {
                            this.matrix = new Matrix();
                        }
                        this.matrix.reset();
                        this.matrix.postScale(f3, f);
                        this.matrix.postRotate((float) getRequiredRotation());
                        Matrix matrix2 = this.matrix;
                        PointF pointF = this.vTranslate;
                        matrix2.postTranslate(pointF.x, pointF.y);
                        if (getRequiredRotation() == 180) {
                            Matrix matrix3 = this.matrix;
                            float f4 = this.scale;
                            matrix3.postTranslate(((float) this.sWidth) * f4, f4 * ((float) this.sHeight));
                        } else if (getRequiredRotation() == 90) {
                            this.matrix.postTranslate(this.scale * ((float) this.sHeight), Utils.FLOAT_EPSILON);
                        } else if (getRequiredRotation() == 270) {
                            this.matrix.postTranslate(Utils.FLOAT_EPSILON, this.scale * ((float) this.sWidth));
                        }
                        if (this.tileBgPaint != null) {
                            if (this.sRect == null) {
                                this.sRect = new RectF();
                            }
                            RectF rectF = this.sRect;
                            if (this.bitmapIsPreview) {
                                i = this.bitmap.getWidth();
                            } else {
                                i = this.sWidth;
                            }
                            float f5 = (float) i;
                            if (this.bitmapIsPreview) {
                                i2 = this.bitmap.getHeight();
                            } else {
                                i2 = this.sHeight;
                            }
                            rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f5, (float) i2);
                            this.matrix.mapRect(this.sRect);
                            canvas2.drawRect(this.sRect, this.tileBgPaint);
                        }
                        canvas2.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
                    }
                } else {
                    int min2 = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
                    boolean z3 = false;
                    for (Map.Entry next : this.tileMap.entrySet()) {
                        if (((Integer) next.getKey()).intValue() == min2) {
                            for (C35798e eVar : (List) next.getValue()) {
                                if (eVar.f86500e && (eVar.f86499d || eVar.f86498c == null)) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                    for (Map.Entry next2 : this.tileMap.entrySet()) {
                        if (((Integer) next2.getKey()).intValue() == min2 || z3) {
                            for (C35798e eVar2 : (List) next2.getValue()) {
                                sourceToViewRect(eVar2.f86496a, eVar2.f86501f);
                                if (eVar2.f86499d || eVar2.f86498c == null) {
                                    i3 = i6;
                                    i4 = i5;
                                    if (eVar2.f86499d && this.debug) {
                                        canvas2.drawText("LOADING", (float) (eVar2.f86501f.left + 5), (float) (eVar2.f86501f.top + 35), this.debugPaint);
                                    }
                                } else {
                                    if (this.tileBgPaint != null) {
                                        canvas2.drawRect(eVar2.f86501f, this.tileBgPaint);
                                    }
                                    if (this.matrix == null) {
                                        this.matrix = new Matrix();
                                    }
                                    this.matrix.reset();
                                    i3 = i6;
                                    i4 = i5;
                                    setMatrixArray(this.srcArray, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) eVar2.f86498c.getWidth(), Utils.FLOAT_EPSILON, (float) eVar2.f86498c.getWidth(), (float) eVar2.f86498c.getHeight(), Utils.FLOAT_EPSILON, (float) eVar2.f86498c.getHeight());
                                    if (getRequiredRotation() == 0) {
                                        setMatrixArray(this.dstArray, (float) eVar2.f86501f.left, (float) eVar2.f86501f.top, (float) eVar2.f86501f.right, (float) eVar2.f86501f.top, (float) eVar2.f86501f.right, (float) eVar2.f86501f.bottom, (float) eVar2.f86501f.left, (float) eVar2.f86501f.bottom);
                                    } else if (getRequiredRotation() == i4) {
                                        setMatrixArray(this.dstArray, (float) eVar2.f86501f.right, (float) eVar2.f86501f.top, (float) eVar2.f86501f.right, (float) eVar2.f86501f.bottom, (float) eVar2.f86501f.left, (float) eVar2.f86501f.bottom, (float) eVar2.f86501f.left, (float) eVar2.f86501f.top);
                                    } else if (getRequiredRotation() == i3) {
                                        setMatrixArray(this.dstArray, (float) eVar2.f86501f.right, (float) eVar2.f86501f.bottom, (float) eVar2.f86501f.left, (float) eVar2.f86501f.bottom, (float) eVar2.f86501f.left, (float) eVar2.f86501f.top, (float) eVar2.f86501f.right, (float) eVar2.f86501f.top);
                                    } else if (getRequiredRotation() == 270) {
                                        setMatrixArray(this.dstArray, (float) eVar2.f86501f.left, (float) eVar2.f86501f.bottom, (float) eVar2.f86501f.left, (float) eVar2.f86501f.top, (float) eVar2.f86501f.right, (float) eVar2.f86501f.top, (float) eVar2.f86501f.right, (float) eVar2.f86501f.bottom);
                                    }
                                    this.matrix.setPolyToPoly(this.srcArray, 0, this.dstArray, 0, 4);
                                    canvas2.drawBitmap(eVar2.f86498c, this.matrix, this.bitmapPaint);
                                    if (this.debug) {
                                        canvas2.drawRect(eVar2.f86501f, this.debugPaint);
                                    }
                                }
                                if (eVar2.f86500e && this.debug) {
                                    canvas2.drawText("ISS " + eVar2.f86497b + " RECT " + eVar2.f86496a.top + "," + eVar2.f86496a.left + "," + eVar2.f86496a.bottom + "," + eVar2.f86496a.right, (float) (eVar2.f86501f.left + 5), (float) (eVar2.f86501f.top + 15), this.debugPaint);
                                }
                                i5 = i4;
                                i6 = i3;
                            }
                        }
                        i5 = i5;
                        i6 = i6;
                    }
                }
                if (this.debug) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scale: ");
                    Locale locale = Locale.ENGLISH;
                    sb.append(String.format(locale, "%.2f", new Object[]{Float.valueOf(this.scale)}));
                    canvas2.drawText(sb.toString(), 5.0f, 15.0f, this.debugPaint);
                    canvas2.drawText("Translate: " + String.format(locale, "%.2f", new Object[]{Float.valueOf(this.vTranslate.x)}) + ":" + String.format(locale, "%.2f", new Object[]{Float.valueOf(this.vTranslate.y)}), 5.0f, 35.0f, this.debugPaint);
                    PointF center = getCenter();
                    canvas2.drawText("Source center: " + String.format(locale, "%.2f", new Object[]{Float.valueOf(center.x)}) + ":" + String.format(locale, "%.2f", new Object[]{Float.valueOf(center.y)}), 5.0f, 55.0f, this.debugPaint);
                    this.debugPaint.setStrokeWidth(2.0f);
                    C35796c cVar = this.anim;
                    if (cVar != null) {
                        PointF sourceToViewCoord = sourceToViewCoord(cVar.f86478c);
                        PointF sourceToViewCoord2 = sourceToViewCoord(this.anim.f86480e);
                        PointF sourceToViewCoord3 = sourceToViewCoord(this.anim.f86479d);
                        canvas2.drawCircle(sourceToViewCoord.x, sourceToViewCoord.y, 10.0f, this.debugPaint);
                        this.debugPaint.setColor(-65536);
                        canvas2.drawCircle(sourceToViewCoord2.x, sourceToViewCoord2.y, 20.0f, this.debugPaint);
                        this.debugPaint.setColor(-16776961);
                        canvas2.drawCircle(sourceToViewCoord3.x, sourceToViewCoord3.y, 25.0f, this.debugPaint);
                        this.debugPaint.setColor(-16711681);
                        canvas2.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), 30.0f, this.debugPaint);
                    }
                    if (this.vCenterStart != null) {
                        this.debugPaint.setColor(-65536);
                        PointF pointF2 = this.vCenterStart;
                        canvas2.drawCircle(pointF2.x, pointF2.y, 20.0f, this.debugPaint);
                    }
                    if (this.quickScaleSCenter != null) {
                        this.debugPaint.setColor(-16776961);
                        canvas2.drawCircle(sourceToViewX(this.quickScaleSCenter.x), sourceToViewY(this.quickScaleSCenter.y), 35.0f, this.debugPaint);
                    }
                    if (this.quickScaleVStart != null) {
                        this.debugPaint.setColor(-16711681);
                        PointF pointF3 = this.quickScaleVStart;
                        canvas2.drawCircle(pointF3.x, pointF3.y, 30.0f, this.debugPaint);
                    }
                    this.debugPaint.setColor(-65281);
                    this.debugPaint.setStrokeWidth(1.0f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onImageLoaded() {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z2 = true;
        if (mode != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (mode2 == 1073741824) {
            z2 = false;
        }
        if (this.sWidth > 0 && this.sHeight > 0) {
            if (z && z2) {
                size = sWidth();
                size2 = sHeight();
            } else if (z2) {
                size2 = (int) ((((double) sHeight()) / ((double) sWidth())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) sWidth()) / ((double) sHeight())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    /* access modifiers changed from: protected */
    public void onReady() {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        debug("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (this.readySent && center != null) {
            this.anim = null;
            this.pendingScale = Float.valueOf(this.scale);
            this.sPendingCenter = center;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        C35796c cVar = this.anim;
        if (cVar == null || cVar.f86484i) {
            C35796c cVar2 = this.anim;
            if (!(cVar2 == null || cVar2.f86488m == null)) {
                try {
                    this.anim.f86488m.onInterruptedByUser();
                } catch (Exception e) {
                    Log.w(TAG, "Error thrown by animation listener", e);
                }
            }
            this.anim = null;
            if (this.vTranslate == null) {
                return true;
            }
            if (this.isQuickScaling || ((gestureDetector = this.detector) != null && !gestureDetector.onTouchEvent(motionEvent))) {
                if (this.vTranslateStart == null) {
                    this.vTranslateStart = new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
                if (this.vTranslateBefore == null) {
                    this.vTranslateBefore = new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
                if (this.vCenterStart == null) {
                    this.vCenterStart = new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
                float f = this.scale;
                this.vTranslateBefore.set(this.vTranslate);
                boolean onTouchEventInternal = onTouchEventInternal(motionEvent);
                sendStateChanged(f, this.vTranslateBefore, 2);
                if (onTouchEventInternal || super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
            this.isZooming = false;
            this.isPanning = false;
            this.maxTouchCount = 0;
            return true;
        }
        requestDisallowInterceptTouchEvent(true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void recalculateMaxScale() {
    }

    public void recycle() {
        reset(true);
        this.bitmapPaint = null;
        this.debugPaint = null;
        this.tileBgPaint = null;
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        this.pendingScale = Float.valueOf(limitedScale(Utils.FLOAT_EPSILON));
        if (isReady()) {
            this.sPendingCenter = new PointF((float) (sWidth() / 2), (float) (sHeight() / 2));
        } else {
            this.sPendingCenter = new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        }
        invalidate();
    }

    public int sHeight() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.sWidth;
        }
        return this.sHeight;
    }

    public int sWidth() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation == 90 || requiredRotation == 270) {
            return this.sHeight;
        }
        return this.sWidth;
    }

    public final void setBitmapDecoderClass(Class<? extends ImageDecoder> cls) {
        if (cls != null) {
            this.bitmapDecoderFactory = new CompatDecoderFactory(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setBitmapDecoderFactory(DecoderFactory<? extends ImageDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.bitmapDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.doubleTapZoomDuration = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.doubleTapZoomScale = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (VALID_ZOOM_STYLES.contains(Integer.valueOf(i))) {
            this.doubleTapZoomStyle = i;
            return;
        }
        throw new IllegalArgumentException("Invalid zoom style: " + i);
    }

    public final void setImage(ImageSource imageSource2) {
        setImage(imageSource2, (ImageSource) null, (ImageViewState) null);
    }

    public final void setMaxScale(float f) {
        this.maxScale = f;
    }

    public void setMaxTileSize(int i) {
        this.maxTileWidth = i;
        this.maxTileHeight = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setMinScale(float f) {
        this.minScale = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setMinimumScaleType(int i) {
        if (VALID_SCALE_TYPES.contains(Integer.valueOf(i))) {
            this.minimumScaleType = i;
            if (isReady()) {
                fitToBounds(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid scale type: " + i);
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.minimumTileDpi = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i);
        if (isReady()) {
            reset(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(OnImageEventListener onImageEventListener2) {
        this.onImageEventListener = onImageEventListener2;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener2) {
        this.onLongClickListener = onLongClickListener2;
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener2) {
        this.onStateChangedListener = onStateChangedListener2;
    }

    public final void setOrientation(int i) {
        if (VALID_ORIENTATIONS.contains(Integer.valueOf(i))) {
            this.orientation = i;
            reset(false);
            invalidate();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i);
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.panEnabled = z;
        if (!z && (pointF = this.vTranslate) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.scale * ((float) (sWidth() / 2)));
            this.vTranslate.y = ((float) (getHeight() / 2)) - (this.scale * ((float) (sHeight() / 2)));
            if (isReady()) {
                refreshRequiredTiles(true);
                invalidate();
            }
        }
    }

    public final void setPanLimit(int i) {
        if (VALID_PAN_LIMITS.contains(Integer.valueOf(i))) {
            this.panLimit = i;
            if (isReady()) {
                fitToBounds(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid pan limit: " + i);
    }

    public void setParallelLoadingEnabled(boolean z) {
        this.parallelLoadingEnabled = z;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.quickScaleEnabled = z;
    }

    public final void setRegionDecoderClass(Class<? extends ImageRegionDecoder> cls) {
        if (cls != null) {
            this.regionDecoderFactory = new CompatDecoderFactory(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setRegionDecoderFactory(DecoderFactory<? extends ImageRegionDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.regionDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setScaleAndCenter(float f, PointF pointF) {
        this.anim = null;
        this.pendingScale = Float.valueOf(f);
        this.sPendingCenter = pointF;
        this.sRequestedCenter = pointF;
        invalidate();
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.tileBgPaint = null;
        } else {
            Paint paint = new Paint();
            this.tileBgPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.tileBgPaint.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.zoomEnabled = z;
    }

    public final PointF sourceToViewCoord(PointF pointF) {
        return sourceToViewCoord(pointF.x, pointF.y, new PointF());
    }

    public final PointF viewToSourceCoord(PointF pointF) {
        return viewToSourceCoord(pointF.x, pointF.y, new PointF());
    }

    /* access modifiers changed from: private */
    public synchronized void onImageLoaded(Bitmap bitmap2, int i, boolean z) {
        OnImageEventListener onImageEventListener2;
        debug("onImageLoaded", new Object[0]);
        int i2 = this.sWidth;
        if (i2 > 0 && this.sHeight > 0 && !(i2 == bitmap2.getWidth() && this.sHeight == bitmap2.getHeight())) {
            reset(false);
        }
        Bitmap bitmap3 = this.bitmap;
        if (bitmap3 != null && !this.bitmapIsCached) {
            bitmap3.recycle();
        }
        if (!(this.bitmap == null || !this.bitmapIsCached || (onImageEventListener2 = this.onImageEventListener) == null)) {
            onImageEventListener2.onPreviewReleased();
        }
        this.bitmapIsPreview = false;
        this.bitmapIsCached = z;
        this.bitmap = bitmap2;
        this.sWidth = bitmap2.getWidth();
        this.sHeight = bitmap2.getHeight();
        this.sOrientation = i;
        boolean checkReady = checkReady();
        boolean checkImageLoaded = checkImageLoaded();
        if (checkReady || checkImageLoaded) {
            invalidate();
            requestLayout();
        }
        recalculateMaxScale();
    }

    public final void setImage(ImageSource imageSource2, ImageViewState imageViewState) {
        setImage(imageSource2, (ImageSource) null, imageViewState);
    }

    public final PointF sourceToViewCoord(float f, float f2) {
        return sourceToViewCoord(f, f2, new PointF());
    }

    public final PointF viewToSourceCoord(float f, float f2) {
        return viewToSourceCoord(f, f2, new PointF());
    }

    public final void setImage(ImageSource imageSource2, ImageSource imageSource3) {
        setImage(imageSource2, imageSource3, (ImageViewState) null);
    }

    public void setMaxTileSize(int i, int i2) {
        this.maxTileWidth = i;
        this.maxTileHeight = i2;
    }

    public final PointF sourceToViewCoord(PointF pointF, PointF pointF2) {
        return sourceToViewCoord(pointF.x, pointF.y, pointF2);
    }

    public final PointF viewToSourceCoord(PointF pointF, PointF pointF2) {
        return viewToSourceCoord(pointF.x, pointF.y, pointF2);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView$AnimationBuilder */
    public final class AnimationBuilder {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private boolean panLimited;
        private final PointF targetSCenter;
        private final float targetScale;
        private final PointF vFocus;

        /* access modifiers changed from: private */
        public AnimationBuilder withOrigin(int i) {
            this.origin = i;
            return this;
        }

        /* access modifiers changed from: private */
        public AnimationBuilder withPanLimited(boolean z) {
            this.panLimited = z;
            return this;
        }

        public void start() {
            PointF pointF;
            if (!(SubsamplingScaleImageView.this.anim == null || SubsamplingScaleImageView.this.anim.f86488m == null)) {
                try {
                    SubsamplingScaleImageView.this.anim.f86488m.onInterruptedByNewAnim();
                } catch (Exception e) {
                    Log.w(SubsamplingScaleImageView.TAG, "Error thrown by animation listener", e);
                }
            }
            int paddingLeft = SubsamplingScaleImageView.this.getPaddingLeft() + (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = SubsamplingScaleImageView.this.getPaddingTop() + (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float limitedScale = SubsamplingScaleImageView.this.limitedScale(this.targetScale);
            if (this.panLimited) {
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                PointF pointF2 = this.targetSCenter;
                pointF = subsamplingScaleImageView.limitedSCenter(pointF2.x, pointF2.y, limitedScale, new PointF());
            } else {
                pointF = this.targetSCenter;
            }
            SubsamplingScaleImageView.this.anim = new C35796c();
            SubsamplingScaleImageView.this.anim.f86476a = SubsamplingScaleImageView.this.scale;
            SubsamplingScaleImageView.this.anim.f86477b = limitedScale;
            SubsamplingScaleImageView.this.anim.f86487l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.f86480e = pointF;
            SubsamplingScaleImageView.this.anim.f86478c = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.anim.f86479d = pointF;
            SubsamplingScaleImageView.this.anim.f86481f = SubsamplingScaleImageView.this.sourceToViewCoord(pointF);
            SubsamplingScaleImageView.this.anim.f86482g = new PointF((float) paddingLeft, (float) paddingTop);
            SubsamplingScaleImageView.this.anim.f86483h = this.duration;
            SubsamplingScaleImageView.this.anim.f86484i = this.interruptible;
            SubsamplingScaleImageView.this.anim.f86485j = this.easing;
            SubsamplingScaleImageView.this.anim.f86486k = this.origin;
            SubsamplingScaleImageView.this.anim.f86487l = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.f86488m = this.listener;
            PointF pointF3 = this.vFocus;
            if (pointF3 != null) {
                float f = pointF3.x - (SubsamplingScaleImageView.this.anim.f86478c.x * limitedScale);
                float f2 = this.vFocus.y - (SubsamplingScaleImageView.this.anim.f86478c.y * limitedScale);
                ScaleAndTranslate scaleAndTranslate = new ScaleAndTranslate(limitedScale, new PointF(f, f2));
                SubsamplingScaleImageView.this.fitToBounds(true, scaleAndTranslate);
                C35796c a = SubsamplingScaleImageView.this.anim;
                PointF pointF4 = this.vFocus;
                float f3 = pointF4.x;
                PointF pointF5 = scaleAndTranslate.vTranslate;
                a.f86482g = new PointF(f3 + (pointF5.x - f), pointF4.y + (pointF5.y - f2));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        public AnimationBuilder withDuration(long j) {
            this.duration = j;
            return this;
        }

        public AnimationBuilder withEasing(int i) {
            if (SubsamplingScaleImageView.VALID_EASING_STYLES.contains(Integer.valueOf(i))) {
                this.easing = i;
                return this;
            }
            throw new IllegalArgumentException("Unknown easing type: " + i);
        }

        public AnimationBuilder withInterruptible(boolean z) {
            this.interruptible = z;
            return this;
        }

        public AnimationBuilder withOnAnimationEventListener(OnAnimationEventListener onAnimationEventListener) {
            this.listener = onAnimationEventListener;
            return this;
        }

        private AnimationBuilder(PointF pointF) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = SubsamplingScaleImageView.this.scale;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder(float f) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = SubsamplingScaleImageView.this.getCenter();
            this.vFocus = null;
        }

        private AnimationBuilder(float f, PointF pointF) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder(float f, PointF pointF, PointF pointF2) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = pointF;
            this.vFocus = pointF2;
        }
    }

    public final void setImage(ImageSource imageSource2, ImageSource imageSource3, ImageViewState imageViewState) {
        if (imageSource2 != null) {
            this.imageSource = imageSource2;
            reset(true);
            if (imageViewState != null) {
                restoreState(imageViewState);
            }
            if (imageSource3 != null) {
                if (imageSource2.getBitmap() != null) {
                    throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
                } else if (imageSource2.getSWidth() <= 0 || imageSource2.getSHeight() <= 0) {
                    throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
                } else {
                    this.sWidth = imageSource2.getSWidth();
                    this.sHeight = imageSource2.getSHeight();
                    this.pRegion = imageSource3.getSRegion();
                    if (imageSource3.getBitmap() != null) {
                        this.bitmapIsCached = imageSource3.isCached();
                        onPreviewLoaded(imageSource3.getBitmap());
                    } else {
                        Uri uri2 = imageSource3.getUri();
                        if (uri2 == null && imageSource3.getResource() != null) {
                            uri2 = Uri.parse("android.resource://" + getContext().getPackageName() + C11110u2.f31950c + imageSource3.getResource());
                        }
                        execute(new C35797d(this, getContext(), this.bitmapDecoderFactory, uri2, true));
                    }
                }
            }
            if (imageSource2.getBitmap() != null && imageSource2.getSRegion() != null) {
                onImageLoaded(Bitmap.createBitmap(imageSource2.getBitmap(), imageSource2.getSRegion().left, imageSource2.getSRegion().top, imageSource2.getSRegion().width(), imageSource2.getSRegion().height()), 0, false);
            } else if (imageSource2.getBitmap() != null) {
                onImageLoaded(imageSource2.getBitmap(), 0, imageSource2.isCached());
            } else {
                this.sRegion = imageSource2.getSRegion();
                Uri uri3 = imageSource2.getUri();
                this.uri = uri3;
                if (uri3 == null && imageSource2.getResource() != null) {
                    this.uri = Uri.parse("android.resource://" + getContext().getPackageName() + C11110u2.f31950c + imageSource2.getResource());
                }
                if (imageSource2.getTile() || this.sRegion != null) {
                    execute(new C35800g(this, getContext(), this.regionDecoderFactory, this.uri));
                    return;
                }
                execute(new C35797d(this, getContext(), this.bitmapDecoderFactory, this.uri, false));
            }
        } else {
            throw new NullPointerException("imageSource must not be null");
        }
    }

    public final PointF sourceToViewCoord(float f, float f2, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(sourceToViewX(f), sourceToViewY(f2));
        return pointF;
    }

    public final PointF viewToSourceCoord(float f, float f2, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(viewToSourceX(f), viewToSourceY(f2));
        return pointF;
    }

    /* access modifiers changed from: protected */
    public void fitToBounds(boolean z) {
        boolean z2;
        if (this.vTranslate == null) {
            this.vTranslate = new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(Utils.FLOAT_EPSILON, new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON));
        }
        ScaleAndTranslate scaleAndTranslate = this.satTemp;
        scaleAndTranslate.scale = this.scale;
        scaleAndTranslate.vTranslate.set(this.vTranslate);
        fitToBounds(z, this.satTemp);
        ScaleAndTranslate scaleAndTranslate2 = this.satTemp;
        this.scale = scaleAndTranslate2.scale;
        this.vTranslate.set(scaleAndTranslate2.vTranslate);
        if (z2) {
            this.vTranslate.set(vTranslateForSCenter((float) (sWidth() / 2), (float) (sHeight() / 2), this.scale));
        }
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, (AttributeSet) null);
    }
}
