package p341ge.bog.chat.presentation.holders;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.chat.presentation.activity.C13032i0;
import p341ge.bog.chat.presentation.activity.C13034j0;
import p341ge.bog.chatkit.messages.MessageHolders;
import p341ge.bog.chatkit.utils.RoundedImageView;
import p419fg.C12884i;
import p503lg.C16574l;
import p517mg.C16683b;
import p653wf.C18587p;
import p653wf.C18588q;

/* renamed from: ge.bog.chat.presentation.holders.CustomOutgoingMessageViewHolder */
public class CustomOutgoingMessageViewHolder extends MessageHolders.OutcomingTextMessageViewHolder<C13034j0> implements C16574l {

    /* renamed from: d */
    private final View f38502d;

    /* renamed from: e */
    private final TextView f38503e;

    /* renamed from: f */
    private final TextView f38504f;

    /* renamed from: g */
    private final View f38505g;

    /* renamed from: h */
    private final ProgressBar f38506h;

    /* renamed from: i */
    private final View f38507i;

    /* renamed from: j */
    private final RoundedImageView f38508j;

    /* renamed from: k */
    private final ProgressBar f38509k;

    /* renamed from: l */
    private final TextView f38510l;

    /* renamed from: m */
    private final View f38511m;

    /* renamed from: n */
    private boolean f38512n;

    /* renamed from: o */
    private boolean f38513o;

    /* renamed from: p */
    private boolean f38514p;

    /* renamed from: ge.bog.chat.presentation.holders.CustomOutgoingMessageViewHolder$a */
    public /* synthetic */ class C13086a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38515a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38516b;

        static {
            int[] iArr = new int[C13032i0.values().length];
            iArr[C13032i0.TEXT.ordinal()] = 1;
            iArr[C13032i0.FILE_ATTACHMENT.ordinal()] = 2;
            f38515a = iArr;
            int[] iArr2 = new int[C12884i.values().length];
            iArr2[C12884i.SENT.ordinal()] = 1;
            iArr2[C12884i.SENDING.ordinal()] = 2;
            iArr2[C12884i.DEFAULT.ordinal()] = 3;
            iArr2[C12884i.FAILED.ordinal()] = 4;
            f38516b = iArr2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomOutgoingMessageViewHolder(View view, Object obj) {
        super(view, obj);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C18588q.fileAttachmentLayout);
        this.f38502d = findViewById;
        View findViewById2 = findViewById.findViewById(C18588q.fileName);
        C41536l.m120488h(findViewById2, "fileAttachmentLayout.findViewById(R.id.fileName)");
        this.f38503e = (TextView) findViewById2;
        View findViewById3 = findViewById.findViewById(C18588q.fileSize);
        C41536l.m120488h(findViewById3, "fileAttachmentLayout.findViewById(R.id.fileSize)");
        this.f38504f = (TextView) findViewById3;
        View findViewById4 = findViewById.findViewById(C18588q.download);
        C41536l.m120488h(findViewById4, "fileAttachmentLayout.findViewById(R.id.download)");
        this.f38505g = findViewById4;
        View findViewById5 = findViewById.findViewById(C18588q.fileDownloadProgress);
        C41536l.m120488h(findViewById5, "fileAttachmentLayout.fin….id.fileDownloadProgress)");
        ProgressBar progressBar = (ProgressBar) findViewById5;
        this.f38506h = progressBar;
        View findViewById6 = view.findViewById(C18588q.imageAttachmentLayout);
        C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.imageAttachmentLayout)");
        this.f38507i = findViewById6;
        View findViewById7 = view.findViewById(C18588q.messageImageAttachment);
        C41536l.m120488h(findViewById7, "itemView.findViewById(R.id.messageImageAttachment)");
        this.f38508j = (RoundedImageView) findViewById7;
        View findViewById8 = view.findViewById(C18588q.messageImageAttachmentProgress);
        C41536l.m120488h(findViewById8, "itemView.findViewById(R.…eImageAttachmentProgress)");
        ProgressBar progressBar2 = (ProgressBar) findViewById8;
        this.f38509k = progressBar2;
        View findViewById9 = view.findViewById(C18588q.messageStatus);
        C41536l.m120488h(findViewById9, "itemView.findViewById(R.id.messageStatus)");
        this.f38510l = (TextView) findViewById9;
        Context context = progressBar.getContext();
        int i = C18587p.chat_attachment_load_progress;
        progressBar.setIndeterminateDrawable(AnimatedVectorDrawableCompat.m7299b(context, i));
        progressBar2.setIndeterminateDrawable(AnimatedVectorDrawableCompat.m7299b(progressBar2.getContext(), i));
        ViewGroup viewGroup = this.bubble;
        C41536l.m120488h(viewGroup, "bubble");
        this.f38511m = viewGroup;
    }

    /* renamed from: a */
    public void mo34409a(boolean z) {
        if (z) {
            this.bubble.setActivated(true);
            C16683b.m59025b(this.f38510l, 0);
        } else {
            this.bubble.setActivated(false);
            C16683b.m59025b(this.f38510l, 8);
        }
        this.f38514p = z;
    }

    /* renamed from: b */
    public boolean mo34410b() {
        return this.f38514p;
    }

    /* renamed from: c */
    public void mo34411c(boolean z) {
        this.f38512n = z;
    }

    /* renamed from: d */
    public boolean mo34412d() {
        return this.f38513o;
    }

    /* renamed from: f */
    public View mo34413f() {
        return this.f38511m;
    }

    /* renamed from: h */
    public boolean mo34418h() {
        return this.f38512n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01d6, code lost:
        if (p517mg.C16683b.m59024a(r13) == false) goto L_0x01da;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBind(p341ge.bog.chat.presentation.activity.C13034j0 r13) {
        /*
            r12 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            super.onBind(r13)
            android.view.View r0 = r12.itemView
            android.content.Context r0 = r0.getContext()
            ge.bog.chat.presentation.activity.g0 r1 = r13.mo34298m()
            if (r1 != 0) goto L_0x0016
            ge.bog.chat.presentation.activity.g0 r1 = p341ge.bog.chat.presentation.activity.C13027g0.NO_GROUP
        L_0x0016:
            android.view.ViewGroup r2 = r12.bubble
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            int r3 = p341ge.bog.chat.presentation.activity.C13037k0.m49204c(r1, r13)
            r2.setLevel(r3)
            android.view.ViewGroup r2 = r12.bubble
            r3 = 0
            r2.setVisibility(r3)
            android.widget.TextView r2 = r12.text
            r4 = 8
            r2.setVisibility(r4)
            android.view.View r2 = r12.f38502d
            r2.setVisibility(r4)
            android.view.View r2 = r12.f38507i
            r2.setVisibility(r4)
            pg.a r2 = r12.getImageLoader()
            java.lang.String r5 = "getImageLoader()"
            kotlin.jvm.internal.C41536l.m120488h(r2, r5)
            ge.bog.chatkit.utils.RoundedImageView r5 = r12.f38508j
            p341ge.bog.chat.presentation.activity.C13052o0.m49235a(r2, r5)
            ge.bog.chat.presentation.activity.i0 r2 = r13.mo34300o()
            int[] r5 = p341ge.bog.chat.presentation.holders.CustomOutgoingMessageViewHolder.C13086a.f38515a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == r7) goto L_0x00fc
            if (r2 == r6) goto L_0x005d
            goto L_0x0101
        L_0x005d:
            fg.a r2 = r13.mo34290f()
            if (r2 == 0) goto L_0x006b
            boolean r2 = p341ge.bog.chat.presentation.activity.C13037k0.m49202a(r2)
            if (r2 != r7) goto L_0x006b
            r2 = r7
            goto L_0x006c
        L_0x006b:
            r2 = r3
        L_0x006c:
            r8 = 0
            if (r2 == 0) goto L_0x009f
            android.view.ViewGroup r2 = r12.bubble
            r2.setVisibility(r4)
            android.view.View r2 = r12.f38507i
            r2.setVisibility(r3)
            int[] r1 = r1.mo34283e()
            ge.bog.chatkit.utils.RoundedImageView r2 = r12.f38508j
            r9 = r1[r3]
            r10 = r1[r7]
            r11 = r1[r6]
            r1 = r1[r5]
            r2.mo34576e(r9, r10, r11, r1)
            pg.a r1 = r12.getImageLoader()
            ge.bog.chatkit.utils.RoundedImageView r2 = r12.f38508j
            ge.bog.chat.presentation.activity.n0$a r9 = new ge.bog.chat.presentation.activity.n0$a
            fg.a r10 = r13.mo34290f()
            android.widget.ProgressBar r11 = r12.f38509k
            r9.<init>(r10, r11)
            r1.mo34322a(r2, r8, r9)
            goto L_0x0101
        L_0x009f:
            android.view.View r1 = r12.f38502d
            r1.setVisibility(r3)
            android.view.View r1 = r12.f38505g
            r1.setVisibility(r3)
            android.widget.ProgressBar r1 = r12.f38506h
            r1.setVisibility(r4)
            android.widget.TextView r1 = r12.f38503e
            fg.a r2 = r13.mo34290f()
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = r2.mo33555b()
            goto L_0x00bc
        L_0x00bb:
            r2 = r8
        L_0x00bc:
            r1.setText(r2)
            fg.a r1 = r13.mo34290f()
            if (r1 == 0) goto L_0x00c9
            java.lang.Long r8 = r1.mo33556c()
        L_0x00c9:
            if (r8 == 0) goto L_0x00f6
            android.widget.TextView r1 = r12.f38504f
            int r2 = p653wf.C18590s.chat_message_attachment_file_size
            java.lang.Object[] r8 = new java.lang.Object[r7]
            hg.e r9 = p447hg.C15502e.f44008a
            fg.a r10 = r13.mo34290f()
            java.lang.Long r10 = r10.mo33556c()
            long r10 = r10.longValue()
            java.math.BigDecimal r9 = r9.mo42604b(r10)
            java.lang.String r9 = r9.toPlainString()
            r8[r3] = r9
            java.lang.String r2 = r0.getString(r2, r8)
            r1.setText(r2)
            android.widget.TextView r1 = r12.f38504f
            r1.setVisibility(r3)
            goto L_0x0101
        L_0x00f6:
            android.widget.TextView r1 = r12.f38504f
            r1.setVisibility(r4)
            goto L_0x0101
        L_0x00fc:
            android.widget.TextView r1 = r12.text
            r1.setVisibility(r3)
        L_0x0101:
            int r1 = p653wf.C18585n.chat_message_status_text_color
            int r2 = p653wf.C18585n.chat_message_text_color
            int r8 = p653wf.C18585n.chat_outgoing_bubble_color
            fg.i r9 = r13.mo34299n()
            int[] r10 = p341ge.bog.chat.presentation.holders.CustomOutgoingMessageViewHolder.C13086a.f38516b
            int r9 = r9.ordinal()
            r9 = r10[r9]
            java.lang.String r10 = " "
            java.lang.String r11 = "HH:mm"
            if (r9 == r7) goto L_0x016e
            if (r9 == r6) goto L_0x0154
            if (r9 == r5) goto L_0x0133
            r4 = 4
            if (r9 == r4) goto L_0x0123
            java.lang.String r4 = ""
            goto L_0x018e
        L_0x0123:
            int r1 = p653wf.C18590s.chat_message_status_failed
            java.lang.String r4 = r0.getString(r1)
            java.lang.String r1 = "ctx.getString(R.string.chat_message_status_failed)"
            kotlin.jvm.internal.C41536l.m120488h(r4, r1)
            int r1 = p653wf.C18585n.chat_message_status_text_color_failed
            int r8 = p653wf.C18585n.chat_outgoing_bubble_color_failed
            goto L_0x018e
        L_0x0133:
            int r4 = p653wf.C18590s.chat_message_status_sent
            java.lang.String r4 = r0.getString(r4)
            java.util.Date r5 = r13.mo34296k()
            java.lang.CharSequence r5 = android.text.format.DateFormat.format(r11, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r10)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            goto L_0x018e
        L_0x0154:
            android.view.View r2 = r12.f38505g
            r2.setVisibility(r4)
            android.widget.ProgressBar r2 = r12.f38506h
            r2.setVisibility(r3)
            int r2 = p653wf.C18590s.chat_message_status_sending
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = "ctx.getString(R.string.c…t_message_status_sending)"
            kotlin.jvm.internal.C41536l.m120488h(r4, r2)
            int r8 = p653wf.C18585n.chat_outgoing_bubble_color_sending
            int r2 = p653wf.C18585n.chat_message_text_color_sending
            goto L_0x018e
        L_0x016e:
            int r4 = p653wf.C18590s.chat_message_status_sent
            java.lang.String r4 = r0.getString(r4)
            java.util.Date r5 = r13.mo34296k()
            java.lang.CharSequence r5 = android.text.format.DateFormat.format(r11, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r10)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
        L_0x018e:
            android.widget.TextView r5 = r12.f38510l
            r5.setText(r4)
            android.widget.TextView r4 = r12.f38510l
            int r1 = androidx.core.content.C0767a.m2893c(r0, r1)
            r4.setTextColor(r1)
            android.widget.TextView r1 = r12.text
            int r4 = androidx.core.content.C0767a.m2893c(r0, r2)
            r1.setTextColor(r4)
            android.widget.TextView r1 = r12.f38503e
            int r2 = androidx.core.content.C0767a.m2893c(r0, r2)
            r1.setTextColor(r2)
            android.view.ViewGroup r1 = r12.bubble
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            android.content.res.ColorStateList r0 = androidx.core.content.C0767a.m2894d(r0, r8)
            androidx.core.graphics.drawable.C0836a.m3153o(r1, r0)
            fg.i r0 = r13.mo34299n()
            fg.i r1 = p419fg.C12884i.FAILED
            if (r0 == r1) goto L_0x01e7
            ge.bog.chat.presentation.activity.i0 r13 = r13.mo34300o()
            ge.bog.chat.presentation.activity.i0 r0 = p341ge.bog.chat.presentation.activity.C13032i0.TEXT
            if (r13 != r0) goto L_0x01d9
            android.widget.TextView r13 = r12.text
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C41536l.m120488h(r13, r0)
            boolean r13 = p517mg.C16683b.m59024a(r13)
            if (r13 != 0) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r7 = r3
        L_0x01da:
            r12.mo34420j(r7)
            boolean r13 = r12.mo34418h()
            if (r13 != 0) goto L_0x01ed
            r12.mo34409a(r3)
            goto L_0x01ed
        L_0x01e7:
            r12.mo34420j(r3)
            r12.mo34409a(r7)
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.chat.presentation.holders.CustomOutgoingMessageViewHolder.onBind(ge.bog.chat.presentation.activity.j0):void");
    }

    /* renamed from: j */
    public void mo34420j(boolean z) {
        this.f38513o = z;
    }
}
