package p341ge.bog.chatkit.messages;

import android.support.p013v4.media.session.C0125b;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p341ge.bog.chatkit.commons.ViewHolder;
import p341ge.bog.chatkit.messages.MessagesListAdapter;
import p341ge.bog.chatkit.utils.RoundedImageView;
import p545og.C17192c;
import p545og.C17194e;
import p545og.C17195f;
import p559pg.C17345a;
import p573qg.C17499b;
import p573qg.C17501d;
import p587rg.C17612a;

@Keep
/* renamed from: ge.bog.chatkit.messages.MessageHolders */
public class MessageHolders {
    private static final short VIEW_TYPE_DATE_HEADER = 130;
    private static final short VIEW_TYPE_IMAGE_MESSAGE = 132;
    private static final short VIEW_TYPE_TEXT_MESSAGE = 131;
    private C13104b contentChecker;
    private List<ContentTypeConfig> customContentTypes = new ArrayList();
    private Class<? extends ViewHolder<Date>> dateHeaderHolder = DefaultDateHeaderViewHolder.class;
    private int dateHeaderLayout = C17195f.item_date_header;
    private HolderConfig<C17501d.C17502a> incomingImageConfig = new HolderConfig<>(DefaultIncomingImageMessageViewHolder.class, C17195f.item_incoming_image_message);
    private HolderConfig<C17499b> incomingTextConfig = new HolderConfig<>(DefaultIncomingTextMessageViewHolder.class, C17195f.item_incoming_text_message);
    private HolderConfig<C17501d.C17502a> outcomingImageConfig = new HolderConfig<>(DefaultOutcomingImageMessageViewHolder.class, C17195f.item_outcoming_image_message);
    private HolderConfig<C17499b> outcomingTextConfig = new HolderConfig<>(DefaultOutcomingTextMessageViewHolder.class, C17195f.item_outcoming_text_message);

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$BaseIncomingMessageViewHolder */
    public static abstract class BaseIncomingMessageViewHolder<MESSAGE extends C17499b> extends BaseMessageViewHolder<MESSAGE> implements C13105c {
        protected TextView time;
        protected ImageView userAvatar;

        @Deprecated
        public BaseIncomingMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        private void init(View view) {
            this.time = (TextView) view.findViewById(C17194e.messageTime);
            this.userAvatar = (ImageView) view.findViewById(C17194e.f48225p);
        }

        public void applyStyle(C13117a aVar) {
            TextView textView = this.time;
            if (textView != null) {
                textView.setTextColor(aVar.mo34535A());
                this.time.setTextSize(0, (float) aVar.mo34536B());
                TextView textView2 = this.time;
                textView2.setTypeface(textView2.getTypeface(), aVar.mo34537C());
            }
            ImageView imageView = this.userAvatar;
            if (imageView != null) {
                imageView.getLayoutParams().width = aVar.mo34561m();
                this.userAvatar.getLayoutParams().height = aVar.mo34560l();
            }
        }

        public void onBind(MESSAGE message) {
            TextView textView = this.time;
            if (textView != null) {
                textView.setText(C17612a.m61245b(message.mo34286c(), C17612a.C17614b.TIME));
            }
            if (this.userAvatar != null) {
                int i = 0;
                boolean z = (this.imageLoader == null || message.mo34287d().mo34235b() == null || message.mo34287d().mo34235b().isEmpty()) ? false : true;
                ImageView imageView = this.userAvatar;
                if (!z) {
                    i = 8;
                }
                imageView.setVisibility(i);
                if (z) {
                    this.imageLoader.mo34322a(this.userAvatar, message.mo34287d().mo34235b(), (Object) null);
                }
            }
        }

        public BaseIncomingMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$BaseMessageViewHolder */
    public static abstract class BaseMessageViewHolder<MESSAGE extends C17499b> extends ViewHolder<MESSAGE> {
        protected C17345a imageLoader;
        boolean isSelected;
        protected Object payload;

        /* renamed from: ge.bog.chatkit.messages.MessageHolders$BaseMessageViewHolder$a */
        class C13102a extends LinkMovementMethod {
            C13102a() {
            }

            public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                boolean z;
                if (!MessagesListAdapter.isSelectionModeEnabled) {
                    z = super.onTouchEvent(textView, spannable, motionEvent);
                } else {
                    z = false;
                }
                BaseMessageViewHolder.this.itemView.onTouchEvent(motionEvent);
                return z;
            }
        }

        @Deprecated
        public BaseMessageViewHolder(View view) {
            super(view);
        }

        /* access modifiers changed from: protected */
        public void configureLinksBehavior(TextView textView) {
            textView.setLinksClickable(false);
            textView.setMovementMethod(new C13102a());
        }

        public C17345a getImageLoader() {
            return this.imageLoader;
        }

        public boolean isSelected() {
            return this.isSelected;
        }

        public boolean isSelectionModeEnabled() {
            return MessagesListAdapter.isSelectionModeEnabled;
        }

        @Keep
        public BaseMessageViewHolder(View view, Object obj) {
            super(view);
            this.payload = obj;
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$BaseOutcomingMessageViewHolder */
    public static abstract class BaseOutcomingMessageViewHolder<MESSAGE extends C17499b> extends BaseMessageViewHolder<MESSAGE> implements C13105c {
        protected TextView time;

        @Deprecated
        public BaseOutcomingMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        private void init(View view) {
            this.time = (TextView) view.findViewById(C17194e.messageTime);
        }

        public void applyStyle(C13117a aVar) {
            TextView textView = this.time;
            if (textView != null) {
                textView.setTextColor(aVar.mo34551R());
                this.time.setTextSize(0, (float) aVar.mo34552S());
                TextView textView2 = this.time;
                textView2.setTypeface(textView2.getTypeface(), aVar.mo34553T());
            }
        }

        public void onBind(MESSAGE message) {
            TextView textView = this.time;
            if (textView != null) {
                textView.setText(C17612a.m61245b(message.mo34286c(), C17612a.C17614b.TIME));
            }
        }

        public BaseOutcomingMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$ContentTypeConfig */
    private static class ContentTypeConfig<TYPE extends C17501d> {
        /* access modifiers changed from: private */
        public HolderConfig<TYPE> incomingConfig;
        /* access modifiers changed from: private */
        public HolderConfig<TYPE> outcomingConfig;
        /* access modifiers changed from: private */
        public byte type;

        /* synthetic */ ContentTypeConfig(byte b, HolderConfig holderConfig, HolderConfig holderConfig2, C13103a aVar) {
            this(b, holderConfig, holderConfig2);
        }

        private ContentTypeConfig(byte b, HolderConfig<TYPE> holderConfig, HolderConfig<TYPE> holderConfig2) {
            this.type = b;
            this.incomingConfig = holderConfig;
            this.outcomingConfig = holderConfig2;
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$DefaultDateHeaderViewHolder */
    public static class DefaultDateHeaderViewHolder extends ViewHolder<Date> implements C13105c {
        protected String dateFormat;
        protected C17612a.C17613a dateHeadersFormatter;
        protected TextView text;

        public DefaultDateHeaderViewHolder(View view) {
            super(view);
            this.text = (TextView) view.findViewById(C17194e.f48224n);
        }

        public void applyStyle(C13117a aVar) {
            TextView textView = this.text;
            if (textView != null) {
                textView.setTextColor(aVar.mo34557i());
                this.text.setTextSize(0, (float) aVar.mo34558j());
                TextView textView2 = this.text;
                textView2.setTypeface(textView2.getTypeface(), aVar.mo34559k());
                this.text.setPadding(aVar.mo34556h(), aVar.mo34556h(), aVar.mo34556h(), aVar.mo34556h());
            }
            String g = aVar.mo34555g();
            this.dateFormat = g;
            if (g == null) {
                g = C17612a.C17614b.STRING_DAY_MONTH_YEAR.mo45191a();
            }
            this.dateFormat = g;
        }

        public void onBind(Date date) {
            if (this.text != null) {
                C17612a.C17613a aVar = this.dateHeadersFormatter;
                String a = aVar != null ? aVar.mo34345a(date) : null;
                TextView textView = this.text;
                if (a == null) {
                    a = C17612a.m61244a(date, this.dateFormat);
                }
                textView.setText(a);
            }
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$DefaultIncomingImageMessageViewHolder */
    private static class DefaultIncomingImageMessageViewHolder extends IncomingImageMessageViewHolder<C17501d.C17502a> {
        public DefaultIncomingImageMessageViewHolder(View view) {
            super(view, (Object) null);
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$DefaultIncomingTextMessageViewHolder */
    private static class DefaultIncomingTextMessageViewHolder extends IncomingTextMessageViewHolder<C17499b> {
        public DefaultIncomingTextMessageViewHolder(View view) {
            super(view, (Object) null);
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$DefaultOutcomingImageMessageViewHolder */
    private static class DefaultOutcomingImageMessageViewHolder extends OutcomingImageMessageViewHolder<C17501d.C17502a> {
        public DefaultOutcomingImageMessageViewHolder(View view) {
            super(view, (Object) null);
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$DefaultOutcomingTextMessageViewHolder */
    private static class DefaultOutcomingTextMessageViewHolder extends OutcomingTextMessageViewHolder<C17499b> {
        public DefaultOutcomingTextMessageViewHolder(View view) {
            super(view, (Object) null);
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$IncomingImageMessageViewHolder */
    public static class IncomingImageMessageViewHolder<MESSAGE extends C17501d.C17502a> extends BaseIncomingMessageViewHolder<MESSAGE> {
        protected ImageView image;
        protected View imageOverlay;

        @Deprecated
        public IncomingImageMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        private void init(View view) {
            this.image = (ImageView) view.findViewById(C17194e.f48223l);
            this.imageOverlay = view.findViewById(C17194e.imageOverlay);
            ImageView imageView = this.image;
            if (imageView instanceof RoundedImageView) {
                int i = C17192c.message_bubble_corners_radius;
                ((RoundedImageView) imageView).mo34576e(i, i, i, 0);
            }
        }

        public final void applyStyle(C13117a aVar) {
            super.applyStyle(aVar);
            TextView textView = this.time;
            if (textView != null) {
                textView.setTextColor(aVar.mo34568t());
                this.time.setTextSize(0, (float) aVar.mo34569u());
                TextView textView2 = this.time;
                textView2.setTypeface(textView2.getTypeface(), aVar.mo34570v());
            }
            View view = this.imageOverlay;
            if (view != null) {
                ViewCompat.m3627v0(view, aVar.mo34567s());
            }
        }

        /* access modifiers changed from: protected */
        public Object getPayloadForImageLoader(MESSAGE message) {
            return null;
        }

        public /* bridge */ /* synthetic */ void onBind(Object obj) {
            C0125b.m366a(obj);
            onBind((C17501d.C17502a) null);
        }

        public /* bridge */ /* synthetic */ void onBind(C17499b bVar) {
            C0125b.m366a(bVar);
            onBind((C17501d.C17502a) null);
        }

        public IncomingImageMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }

        public void onBind(MESSAGE message) {
            C17345a aVar;
            super.onBind(message);
            ImageView imageView = this.image;
            if (!(imageView == null || (aVar = this.imageLoader) == null)) {
                aVar.mo34322a(imageView, message.getImageUrl(), getPayloadForImageLoader(message));
            }
            View view = this.imageOverlay;
            if (view != null) {
                view.setSelected(isSelected());
            }
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$IncomingTextMessageViewHolder */
    public static class IncomingTextMessageViewHolder<MESSAGE extends C17499b> extends BaseIncomingMessageViewHolder<MESSAGE> {
        protected ViewGroup bubble;
        protected TextView text;

        @Deprecated
        public IncomingTextMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        private void init(View view) {
            this.bubble = (ViewGroup) view.findViewById(C17194e.f48222a);
            this.text = (TextView) view.findViewById(C17194e.f48224n);
        }

        public void applyStyle(C13117a aVar) {
            super.applyStyle(aVar);
            ViewGroup viewGroup = this.bubble;
            if (viewGroup != null) {
                viewGroup.setPadding(aVar.mo34564p(), aVar.mo34566r(), aVar.mo34565q(), aVar.mo34563o());
                ViewCompat.m3627v0(this.bubble, aVar.mo34562n());
            }
            TextView textView = this.text;
            if (textView != null) {
                textView.setTextColor(aVar.mo34571w());
                this.text.setTextSize(0, (float) aVar.mo34573y());
                TextView textView2 = this.text;
                textView2.setTypeface(textView2.getTypeface(), aVar.mo34574z());
                this.text.setAutoLinkMask(aVar.mo34554U());
                this.text.setLinkTextColor(aVar.mo34572x());
                configureLinksBehavior(this.text);
            }
        }

        public void onBind(MESSAGE message) {
            super.onBind(message);
            ViewGroup viewGroup = this.bubble;
            if (viewGroup != null) {
                viewGroup.setSelected(isSelected());
            }
            TextView textView = this.text;
            if (textView != null) {
                textView.setText(message.mo34285b());
            }
        }

        public IncomingTextMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$OutcomingImageMessageViewHolder */
    public static class OutcomingImageMessageViewHolder<MESSAGE extends C17501d.C17502a> extends BaseOutcomingMessageViewHolder<MESSAGE> {
        protected ImageView image;
        protected View imageOverlay;

        @Deprecated
        public OutcomingImageMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        private void init(View view) {
            this.image = (ImageView) view.findViewById(C17194e.f48223l);
            this.imageOverlay = view.findViewById(C17194e.imageOverlay);
            ImageView imageView = this.image;
            if (imageView instanceof RoundedImageView) {
                int i = C17192c.message_bubble_corners_radius;
                ((RoundedImageView) imageView).mo34576e(i, i, 0, i);
            }
        }

        public final void applyStyle(C13117a aVar) {
            super.applyStyle(aVar);
            TextView textView = this.time;
            if (textView != null) {
                textView.setTextColor(aVar.mo34544K());
                this.time.setTextSize(0, (float) aVar.mo34545L());
                TextView textView2 = this.time;
                textView2.setTypeface(textView2.getTypeface(), aVar.mo34546M());
            }
            View view = this.imageOverlay;
            if (view != null) {
                ViewCompat.m3627v0(view, aVar.mo34543J());
            }
        }

        /* access modifiers changed from: protected */
        public Object getPayloadForImageLoader(MESSAGE message) {
            return null;
        }

        public /* bridge */ /* synthetic */ void onBind(Object obj) {
            C0125b.m366a(obj);
            onBind((C17501d.C17502a) null);
        }

        public /* bridge */ /* synthetic */ void onBind(C17499b bVar) {
            C0125b.m366a(bVar);
            onBind((C17501d.C17502a) null);
        }

        public OutcomingImageMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }

        public void onBind(MESSAGE message) {
            C17345a aVar;
            super.onBind(message);
            ImageView imageView = this.image;
            if (!(imageView == null || (aVar = this.imageLoader) == null)) {
                aVar.mo34322a(imageView, message.getImageUrl(), getPayloadForImageLoader(message));
            }
            View view = this.imageOverlay;
            if (view != null) {
                view.setSelected(isSelected());
            }
        }
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$OutcomingTextMessageViewHolder */
    public static class OutcomingTextMessageViewHolder<MESSAGE extends C17499b> extends BaseOutcomingMessageViewHolder<MESSAGE> {
        protected ViewGroup bubble;
        protected TextView text;

        @Deprecated
        public OutcomingTextMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        private void init(View view) {
            this.bubble = (ViewGroup) view.findViewById(C17194e.f48222a);
            this.text = (TextView) view.findViewById(C17194e.f48224n);
        }

        public final void applyStyle(C13117a aVar) {
            super.applyStyle(aVar);
            ViewGroup viewGroup = this.bubble;
            if (viewGroup != null) {
                viewGroup.setPadding(aVar.mo34540G(), aVar.mo34542I(), aVar.mo34541H(), aVar.mo34539F());
                ViewCompat.m3627v0(this.bubble, aVar.mo34538E());
            }
            TextView textView = this.text;
            if (textView != null) {
                textView.setTextColor(aVar.mo34547N());
                this.text.setTextSize(0, (float) aVar.mo34549P());
                TextView textView2 = this.text;
                textView2.setTypeface(textView2.getTypeface(), aVar.mo34550Q());
                this.text.setAutoLinkMask(aVar.mo34554U());
                this.text.setLinkTextColor(aVar.mo34548O());
                configureLinksBehavior(this.text);
            }
        }

        public void onBind(MESSAGE message) {
            super.onBind(message);
            ViewGroup viewGroup = this.bubble;
            if (viewGroup != null) {
                viewGroup.setSelected(isSelected());
            }
            TextView textView = this.text;
            if (textView != null) {
                textView.setText(message.mo34285b());
            }
        }

        public OutcomingTextMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }
    }

    /* renamed from: ge.bog.chatkit.messages.MessageHolders$a */
    class C13103a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ SparseArray f38541d;

        /* renamed from: e */
        final /* synthetic */ int f38542e;

        /* renamed from: f */
        final /* synthetic */ View f38543f;

        /* renamed from: g */
        final /* synthetic */ Object f38544g;

        C13103a(SparseArray sparseArray, int i, View view, Object obj) {
            this.f38541d = sparseArray;
            this.f38542e = i;
            this.f38543f = view;
            this.f38544g = obj;
        }

        public void onClick(View view) {
            ((MessagesListAdapter.C13113g) this.f38541d.get(this.f38542e)).mo34346a(this.f38543f, (C17499b) this.f38544g);
        }
    }

    /* renamed from: ge.bog.chatkit.messages.MessageHolders$b */
    public interface C13104b {
        /* renamed from: a */
        boolean mo34342a(C17499b bVar, byte b);
    }

    /* renamed from: ge.bog.chatkit.messages.MessageHolders$c */
    interface C13105c {
        void applyStyle(C13117a aVar);
    }

    private short getContentViewType(C17499b bVar) {
        if (!(bVar instanceof C17501d)) {
            return VIEW_TYPE_TEXT_MESSAGE;
        }
        int i = 0;
        while (i < this.customContentTypes.size()) {
            ContentTypeConfig contentTypeConfig = this.customContentTypes.get(i);
            C13104b bVar2 = this.contentChecker;
            if (bVar2 == null) {
                throw new IllegalArgumentException("ContentChecker cannot be null when using custom content types!");
            } else if (bVar2.mo34342a(bVar, contentTypeConfig.type)) {
                return (short) contentTypeConfig.type;
            } else {
                i++;
            }
        }
        return VIEW_TYPE_TEXT_MESSAGE;
    }

    /* access modifiers changed from: protected */
    public void bind(ViewHolder viewHolder, Object obj, boolean z, C17345a aVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, C17612a.C17613a aVar2, SparseArray<MessagesListAdapter.C13113g> sparseArray) {
        if (obj instanceof C17499b) {
            BaseMessageViewHolder baseMessageViewHolder = (BaseMessageViewHolder) viewHolder;
            baseMessageViewHolder.isSelected = z;
            baseMessageViewHolder.imageLoader = aVar;
            viewHolder.itemView.setOnLongClickListener(onLongClickListener);
            viewHolder.itemView.setOnClickListener(onClickListener);
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                View findViewById = viewHolder.itemView.findViewById(keyAt);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C13103a(sparseArray, keyAt, findViewById, obj));
                }
            }
        } else if (obj instanceof Date) {
            ((DefaultDateHeaderViewHolder) viewHolder).dateHeadersFormatter = aVar2;
        }
        viewHolder.onBind(obj);
    }

    /* access modifiers changed from: protected */
    public ViewHolder getHolder(ViewGroup viewGroup, int i, C13117a aVar) {
        if (i == -132) {
            return getHolder(viewGroup, (HolderConfig) this.outcomingImageConfig, aVar);
        }
        if (i == -131) {
            return getHolder(viewGroup, (HolderConfig) this.outcomingTextConfig, aVar);
        }
        switch (i) {
            case 130:
                return getHolder(viewGroup, this.dateHeaderLayout, this.dateHeaderHolder, aVar, (Object) null);
            case 131:
                return getHolder(viewGroup, (HolderConfig) this.incomingTextConfig, aVar);
            case 132:
                return getHolder(viewGroup, (HolderConfig) this.incomingImageConfig, aVar);
            default:
                for (ContentTypeConfig next : this.customContentTypes) {
                    if (Math.abs(next.type) == Math.abs(i)) {
                        if (i > 0) {
                            return getHolder(viewGroup, next.incomingConfig, aVar);
                        }
                        return getHolder(viewGroup, next.outcomingConfig, aVar);
                    }
                }
                throw new IllegalStateException("Wrong message view type. Please, report this issue on GitHub with full stacktrace in description.");
        }
    }

    /* access modifiers changed from: protected */
    public int getViewType(Object obj, String str) {
        boolean z;
        short s;
        if (obj instanceof C17499b) {
            C17499b bVar = (C17499b) obj;
            z = bVar.mo34287d().mo34234a().contentEquals(str);
            s = getContentViewType(bVar);
        } else {
            z = false;
            s = VIEW_TYPE_DATE_HEADER;
        }
        if (z) {
            return s * -1;
        }
        return s;
    }

    public <TYPE extends C17501d> MessageHolders registerContentType(byte b, Class<? extends BaseMessageViewHolder<TYPE>> cls, int i, int i2, C13104b bVar) {
        return registerContentType(b, cls, i, cls, i2, bVar);
    }

    public MessageHolders setDateHeaderConfig(Class<? extends ViewHolder<Date>> cls, int i) {
        this.dateHeaderHolder = cls;
        this.dateHeaderLayout = i;
        return this;
    }

    public MessageHolders setDateHeaderHolder(Class<? extends ViewHolder<Date>> cls) {
        this.dateHeaderHolder = cls;
        return this;
    }

    public MessageHolders setDateHeaderLayout(int i) {
        this.dateHeaderLayout = i;
        return this;
    }

    public MessageHolders setIncomingImageConfig(Class<? extends BaseMessageViewHolder<? extends C17501d.C17502a>> cls, int i) {
        HolderConfig<C17501d.C17502a> holderConfig = this.incomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        return this;
    }

    public MessageHolders setIncomingImageHolder(Class<? extends BaseMessageViewHolder<? extends C17501d.C17502a>> cls) {
        this.incomingImageConfig.holder = cls;
        return this;
    }

    public MessageHolders setIncomingImageLayout(int i) {
        this.incomingImageConfig.layout = i;
        return this;
    }

    public MessageHolders setIncomingTextConfig(Class<? extends BaseMessageViewHolder<? extends C17499b>> cls, int i) {
        HolderConfig<C17499b> holderConfig = this.incomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        return this;
    }

    public MessageHolders setIncomingTextHolder(Class<? extends BaseMessageViewHolder<? extends C17499b>> cls) {
        this.incomingTextConfig.holder = cls;
        return this;
    }

    public MessageHolders setIncomingTextLayout(int i) {
        this.incomingTextConfig.layout = i;
        return this;
    }

    public MessageHolders setOutcomingImageConfig(Class<? extends BaseMessageViewHolder<? extends C17501d.C17502a>> cls, int i) {
        HolderConfig<C17501d.C17502a> holderConfig = this.outcomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        return this;
    }

    public MessageHolders setOutcomingImageHolder(Class<? extends BaseMessageViewHolder<? extends C17501d.C17502a>> cls) {
        this.outcomingImageConfig.holder = cls;
        return this;
    }

    public MessageHolders setOutcomingImageLayout(int i) {
        this.outcomingImageConfig.layout = i;
        return this;
    }

    public MessageHolders setOutcomingTextConfig(Class<? extends BaseMessageViewHolder<? extends C17499b>> cls, int i) {
        HolderConfig<C17499b> holderConfig = this.outcomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        return this;
    }

    public MessageHolders setOutcomingTextHolder(Class<? extends BaseMessageViewHolder<? extends C17499b>> cls) {
        this.outcomingTextConfig.holder = cls;
        return this;
    }

    public MessageHolders setOutcomingTextLayout(int i) {
        this.outcomingTextConfig.layout = i;
        return this;
    }

    public <TYPE extends C17501d> MessageHolders registerContentType(byte b, Class<? extends BaseMessageViewHolder<TYPE>> cls, int i, Class<? extends BaseMessageViewHolder<TYPE>> cls2, int i2, C13104b bVar) {
        if (b != 0) {
            this.customContentTypes.add(new ContentTypeConfig(b, new HolderConfig(cls, i), new HolderConfig(cls2, i2), (C13103a) null));
            this.contentChecker = bVar;
            return this;
        }
        throw new IllegalArgumentException("content type must be greater or less than '0'!");
    }

    public MessageHolders setIncomingImageHolder(Class<? extends BaseMessageViewHolder<? extends C17501d.C17502a>> cls, Object obj) {
        HolderConfig<C17501d.C17502a> holderConfig = this.incomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setIncomingImageLayout(int i, Object obj) {
        HolderConfig<C17501d.C17502a> holderConfig = this.incomingImageConfig;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setIncomingTextHolder(Class<? extends BaseMessageViewHolder<? extends C17499b>> cls, Object obj) {
        HolderConfig<C17499b> holderConfig = this.incomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setIncomingTextLayout(int i, Object obj) {
        HolderConfig<C17499b> holderConfig = this.incomingTextConfig;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingImageHolder(Class<? extends BaseMessageViewHolder<? extends C17501d.C17502a>> cls, Object obj) {
        HolderConfig<C17501d.C17502a> holderConfig = this.outcomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingImageLayout(int i, Object obj) {
        HolderConfig<C17501d.C17502a> holderConfig = this.outcomingImageConfig;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingTextHolder(Class<? extends BaseMessageViewHolder<? extends C17499b>> cls, Object obj) {
        HolderConfig<C17499b> holderConfig = this.outcomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingTextLayout(int i, Object obj) {
        HolderConfig<C17499b> holderConfig = this.outcomingTextConfig;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    @Keep
    /* renamed from: ge.bog.chatkit.messages.MessageHolders$HolderConfig */
    private class HolderConfig<T extends C17499b> {
        protected Class<? extends BaseMessageViewHolder<? extends T>> holder;
        protected int layout;
        protected Object payload;

        HolderConfig(Class<? extends BaseMessageViewHolder<? extends T>> cls, int i) {
            this.holder = cls;
            this.layout = i;
        }

        HolderConfig(Class<? extends BaseMessageViewHolder<? extends T>> cls, int i, Object obj) {
            this.holder = cls;
            this.layout = i;
            this.payload = obj;
        }
    }

    public MessageHolders setIncomingImageConfig(Class<? extends BaseMessageViewHolder<? extends C17501d.C17502a>> cls, int i, Object obj) {
        HolderConfig<C17501d.C17502a> holderConfig = this.incomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setIncomingTextConfig(Class<? extends BaseMessageViewHolder<? extends C17499b>> cls, int i, Object obj) {
        HolderConfig<C17499b> holderConfig = this.incomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingImageConfig(Class<? extends BaseMessageViewHolder<? extends C17501d.C17502a>> cls, int i, Object obj) {
        HolderConfig<C17501d.C17502a> holderConfig = this.outcomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingTextConfig(Class<? extends BaseMessageViewHolder<? extends C17499b>> cls, int i, Object obj) {
        HolderConfig<C17499b> holderConfig = this.outcomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public <TYPE extends C17501d> MessageHolders registerContentType(byte b, Class<? extends BaseMessageViewHolder<TYPE>> cls, Object obj, int i, Class<? extends BaseMessageViewHolder<TYPE>> cls2, Object obj2, int i2, C13104b bVar) {
        if (b != 0) {
            this.customContentTypes.add(new ContentTypeConfig(b, new HolderConfig(cls, i, obj), new HolderConfig(cls2, i2, obj2), (C13103a) null));
            this.contentChecker = bVar;
            return this;
        }
        throw new IllegalArgumentException("content type must be greater or less than '0'!");
    }

    private ViewHolder getHolder(ViewGroup viewGroup, HolderConfig holderConfig, C13117a aVar) {
        return getHolder(viewGroup, holderConfig.layout, holderConfig.holder, aVar, holderConfig.payload);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <HOLDER extends p341ge.bog.chatkit.commons.ViewHolder> p341ge.bog.chatkit.commons.ViewHolder getHolder(android.view.ViewGroup r6, int r7, java.lang.Class<HOLDER> r8, p341ge.bog.chatkit.messages.C13117a r9, java.lang.Object r10) {
        /*
            r5 = this;
            java.lang.Class<android.view.View> r0 = android.view.View.class
            android.content.Context r1 = r6.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 0
            android.view.View r6 = r1.inflate(r7, r6, r2)
            r7 = 2
            r1 = 1
            java.lang.Class[] r3 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x002f }
            r3[r2] = r0     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r1] = r4     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.reflect.Constructor r3 = r8.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x002f }
            r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ NoSuchMethodException -> 0x002f }
            r7[r2] = r6     // Catch:{ NoSuchMethodException -> 0x002f }
            r7[r1] = r10     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object r7 = r3.newInstance(r7)     // Catch:{ NoSuchMethodException -> 0x002f }
            ge.bog.chatkit.commons.ViewHolder r7 = (p341ge.bog.chatkit.commons.ViewHolder) r7     // Catch:{ NoSuchMethodException -> 0x002f }
            goto L_0x0045
        L_0x002d:
            r6 = move-exception
            goto L_0x0052
        L_0x002f:
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x002d }
            r7[r2] = r0     // Catch:{ Exception -> 0x002d }
            java.lang.reflect.Constructor r7 = r8.getDeclaredConstructor(r7)     // Catch:{ Exception -> 0x002d }
            r7.setAccessible(r1)     // Catch:{ Exception -> 0x002d }
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x002d }
            r8[r2] = r6     // Catch:{ Exception -> 0x002d }
            java.lang.Object r6 = r7.newInstance(r8)     // Catch:{ Exception -> 0x002d }
            r7 = r6
            ge.bog.chatkit.commons.ViewHolder r7 = (p341ge.bog.chatkit.commons.ViewHolder) r7     // Catch:{ Exception -> 0x002d }
        L_0x0045:
            boolean r6 = r7 instanceof p341ge.bog.chatkit.messages.MessageHolders.C13105c     // Catch:{ Exception -> 0x002d }
            if (r6 == 0) goto L_0x0051
            if (r9 == 0) goto L_0x0051
            r6 = r7
            ge.bog.chatkit.messages.MessageHolders$c r6 = (p341ge.bog.chatkit.messages.MessageHolders.C13105c) r6     // Catch:{ Exception -> 0x002d }
            r6.applyStyle(r9)     // Catch:{ Exception -> 0x002d }
        L_0x0051:
            return r7
        L_0x0052:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Somehow we couldn't create the ViewHolder for message. Please, report this issue on GitHub with full stacktrace in description."
            r8.append(r9)
            java.lang.String r9 = r6.getMessage()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.chatkit.messages.MessageHolders.getHolder(android.view.ViewGroup, int, java.lang.Class, ge.bog.chatkit.messages.a, java.lang.Object):ge.bog.chatkit.commons.ViewHolder");
    }
}
