package p341ge.bog.chat.presentation.holders;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.chat.presentation.activity.C13032i0;
import p341ge.bog.chat.presentation.activity.C13034j0;
import p341ge.bog.chatkit.messages.MessageHolders;
import p447hg.C15499c;
import p653wf.C18585n;
import p653wf.C18587p;
import p653wf.C18588q;
import p653wf.C18590s;

/* renamed from: ge.bog.chat.presentation.holders.ParticipantJoinedChatEndedMessageViewHolder */
public final class ParticipantJoinedChatEndedMessageViewHolder extends MessageHolders.BaseMessageViewHolder<C13034j0> {

    /* renamed from: d */
    private final View f38517d;

    /* renamed from: e */
    private final TextView f38518e;

    /* renamed from: ge.bog.chat.presentation.holders.ParticipantJoinedChatEndedMessageViewHolder$a */
    public /* synthetic */ class C13087a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38519a;

        static {
            int[] iArr = new int[C13032i0.values().length];
            iArr[C13032i0.PARTICIPANT_JOINED.ordinal()] = 1;
            iArr[C13032i0.CHAT_ENDED.ordinal()] = 2;
            f38519a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParticipantJoinedChatEndedMessageViewHolder(View view) {
        super(view, (Object) null);
        C41536l.m120489i(view, "itemView");
        this.f38517d = view;
        this.f38518e = (TextView) view.findViewById(C18588q.eventText);
    }

    /* renamed from: h */
    public void onBind(C13034j0 j0Var) {
        C41536l.m120489i(j0Var, "data");
        Context context = this.f38518e.getContext();
        int i = C13087a.f38519a[j0Var.mo34300o().ordinal()];
        if (i == 1) {
            this.f38518e.setBackgroundResource(C18587p.chat_participant_joined_item_background);
            TextView textView = this.f38518e;
            Context context2 = this.f38517d.getContext();
            C41536l.m120488h(context2, "itemView.context");
            textView.setTextColor(C15499c.m56060c(context2));
            this.f38518e.setText(context.getString(C18590s.participant_joined_to_chat));
        } else if (i == 2) {
            this.f38518e.setBackgroundResource(C18587p.chat_ended_item_background);
            this.f38518e.setTextColor(C0767a.m2893c(context, C18585n.chat_ended_item_text_color));
            this.f38518e.setText(context.getString(C18590s.conversation_ended));
        }
    }
}
