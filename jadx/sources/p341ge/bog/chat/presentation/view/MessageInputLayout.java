package p341ge.bog.chat.presentation.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p653wf.C18587p;
import p653wf.C18588q;
import p653wf.C18589r;

/* renamed from: ge.bog.chat.presentation.view.MessageInputLayout */
public final class MessageInputLayout extends FrameLayout implements View.OnClickListener, TextWatcher {

    /* renamed from: d */
    private final EditText f38520d;

    /* renamed from: e */
    private final ImageButton f38521e;

    /* renamed from: f */
    private final ImageButton f38522f;

    /* renamed from: g */
    private C13091d f38523g;

    /* renamed from: h */
    private C13090c f38524h;

    /* renamed from: i */
    private C13089b f38525i;

    /* renamed from: j */
    private CharSequence f38526j;

    /* renamed from: k */
    private C13088a f38527k = C13088a.ATTACHMENT;

    /* renamed from: ge.bog.chat.presentation.view.MessageInputLayout$a */
    public enum C13088a {
        ARROW(C18587p.ic_chat_input_arrow),
        ATTACHMENT(C18587p.ic_chat_attachment);
        

        /* renamed from: d */
        private final int f38531d;

        private C13088a(int i) {
            this.f38531d = i;
        }

        /* renamed from: b */
        public final int mo34433b() {
            return this.f38531d;
        }
    }

    /* renamed from: ge.bog.chat.presentation.view.MessageInputLayout$b */
    public interface C13089b {
        /* renamed from: a */
        void mo34213a();
    }

    /* renamed from: ge.bog.chat.presentation.view.MessageInputLayout$c */
    public interface C13090c {
        /* renamed from: a */
        boolean mo34210a(CharSequence charSequence);
    }

    /* renamed from: ge.bog.chat.presentation.view.MessageInputLayout$d */
    private static final class C13091d extends Handler {

        /* renamed from: b */
        public static final C13092a f38532b = new C13092a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final C13093e f38533a;

        /* renamed from: ge.bog.chat.presentation.view.MessageInputLayout$d$a */
        public static final class C13092a {
            private C13092a() {
            }

            public /* synthetic */ C13092a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C13091d(C13093e eVar) {
            C41536l.m120489i(eVar, "listener");
            this.f38533a = eVar;
        }

        /* renamed from: a */
        public final void mo34434a() {
            if (hasMessages(1)) {
                removeMessages(1);
            } else {
                this.f38533a.mo34211a();
            }
            sendEmptyMessageDelayed(1, 500);
        }

        /* renamed from: b */
        public final void mo34435b() {
            removeMessages(1);
        }

        public void handleMessage(Message message) {
            C41536l.m120489i(message, "msg");
            if (message.what == 1) {
                this.f38533a.mo34212b();
            }
        }
    }

    /* renamed from: ge.bog.chat.presentation.view.MessageInputLayout$e */
    public interface C13093e {
        /* renamed from: a */
        void mo34211a();

        /* renamed from: b */
        void mo34212b();
    }

    /* renamed from: ge.bog.chat.presentation.view.MessageInputLayout$f */
    public /* synthetic */ class C13094f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38534a;

        static {
            int[] iArr = new int[C13088a.values().length];
            iArr[C13088a.ARROW.ordinal()] = 1;
            iArr[C13088a.ATTACHMENT.ordinal()] = 2;
            f38534a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        View.inflate(context, C18589r.layout_message_input, this);
        View findViewById = findViewById(C18588q.messageInput);
        C41536l.m120488h(findViewById, "findViewById(R.id.messageInput)");
        EditText editText = (EditText) findViewById;
        this.f38520d = editText;
        View findViewById2 = findViewById(C18588q.messageSendButton);
        C41536l.m120488h(findViewById2, "findViewById(R.id.messageSendButton)");
        ImageButton imageButton = (ImageButton) findViewById2;
        this.f38521e = imageButton;
        View findViewById3 = findViewById(C18588q.attachmentButton);
        C41536l.m120488h(findViewById3, "findViewById(R.id.attachmentButton)");
        ImageButton imageButton2 = (ImageButton) findViewById3;
        this.f38522f = imageButton2;
        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        editText.addTextChangedListener(this);
        editText.setText("");
    }

    /* renamed from: a */
    private final void m49339a(C13088a aVar) {
        this.f38527k = aVar;
        this.f38522f.setImageResource(aVar.mo34433b());
    }

    /* renamed from: b */
    private final void m49340b() {
        C13089b bVar = this.f38525i;
        if (bVar != null) {
            bVar.mo34213a();
        }
    }

    /* renamed from: c */
    private final boolean m49341c() {
        C13090c cVar = this.f38524h;
        if (cVar != null) {
            return cVar.mo34210a(this.f38526j);
        }
        return false;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final C13089b getAttachmentsListener() {
        return this.f38525i;
    }

    public final C13090c getInputListener() {
        return this.f38524h;
    }

    public void onClick(View view) {
        C41536l.m120489i(view, "view");
        int id = view.getId();
        if (id == C18588q.messageSendButton) {
            if (m49341c()) {
                this.f38520d.setText("");
            }
        } else if (id == C18588q.attachmentButton) {
            int i = C13094f.f38534a[this.f38527k.ordinal()];
            if (i == 1) {
                m49339a(C13088a.ATTACHMENT);
            } else if (i == 2) {
                m49340b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C13091d dVar = this.f38523g;
        if (dVar != null) {
            dVar.mo34435b();
        }
        super.onDetachedFromWindow();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        C41536l.m120489i(charSequence, "s");
        this.f38526j = charSequence;
        ImageButton imageButton = this.f38521e;
        if (charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        imageButton.setEnabled(z);
        if (this.f38521e.isEnabled()) {
            m49339a(C13088a.ARROW);
        } else {
            m49339a(C13088a.ATTACHMENT);
        }
        C13091d dVar = this.f38523g;
        if (dVar != null) {
            dVar.mo34434a();
        }
    }

    public final void setAttachmentsListener(C13089b bVar) {
        this.f38525i = bVar;
    }

    public final void setInputListener(C13090c cVar) {
        this.f38524h = cVar;
    }

    public final void setTypingListener(C13093e eVar) {
        C13091d dVar;
        C13091d dVar2 = this.f38523g;
        if (dVar2 != null) {
            dVar2.mo34435b();
        }
        if (eVar == null) {
            dVar = null;
        } else {
            dVar = new C13091d(eVar);
        }
        this.f38523g = dVar;
    }
}
