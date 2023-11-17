package p341ge.bog.chatkit.messages;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p341ge.bog.chatkit.commons.ViewHolder;
import p341ge.bog.chatkit.messages.C13118b;
import p341ge.bog.chatkit.messages.MessageHolders;
import p559pg.C17345a;
import p573qg.C17499b;
import p587rg.C17612a;

@Keep
/* renamed from: ge.bog.chatkit.messages.MessagesListAdapter */
public class MessagesListAdapter<MESSAGE extends C17499b> extends RecyclerView.C1736h implements C13118b.C13119a {
    protected static boolean isSelectionModeEnabled;
    private C17612a.C17613a dateHeadersFormatter;
    private MessageHolders holders;
    private C17345a imageLoader;
    protected List<C13116j> items;
    private RecyclerView.C1747p layoutManager;
    private C13110d loadMoreListener;
    private C13117a messagesListStyle;
    private C13111e onMessageClickListener;
    private C13112f onMessageLongClickListener;
    private C13113g onMessageViewClickListener;
    private C13114h onMessageViewLongClickListener;
    private int selectedItemsCount;
    /* access modifiers changed from: private */
    public C13115i selectionListener;
    private String senderId;
    private SparseArray<C13113g> viewClickListenersArray;

    @Keep
    @Deprecated
    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$BaseMessageViewHolder */
    public static abstract class BaseMessageViewHolder<MESSAGE extends C17499b> extends MessageHolders.BaseMessageViewHolder<MESSAGE> {
        protected C17345a imageLoader;
        private boolean isSelected;

        /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$BaseMessageViewHolder$a */
        class C13106a extends LinkMovementMethod {
            C13106a() {
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

        public BaseMessageViewHolder(View view) {
            super(view);
        }

        /* access modifiers changed from: protected */
        public void configureLinksBehavior(TextView textView) {
            textView.setLinksClickable(false);
            textView.setMovementMethod(new C13106a());
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
    }

    @Keep
    @Deprecated
    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$IncomingMessageViewHolder */
    public static class IncomingMessageViewHolder<MESSAGE extends C17499b> extends MessageHolders.IncomingTextMessageViewHolder<MESSAGE> {
        public IncomingMessageViewHolder(View view) {
            super(view);
        }
    }

    @Keep
    @Deprecated
    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$OutcomingMessageViewHolder */
    public static class OutcomingMessageViewHolder<MESSAGE extends C17499b> extends MessageHolders.OutcomingTextMessageViewHolder<MESSAGE> {
        public OutcomingMessageViewHolder(View view) {
            super(view);
        }
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$a */
    class C13107a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C13116j f38548d;

        C13107a(C13116j jVar) {
            this.f38548d = jVar;
        }

        public void onClick(View view) {
            if (MessagesListAdapter.this.selectionListener == null || !MessagesListAdapter.isSelectionModeEnabled) {
                MessagesListAdapter.this.notifyMessageClicked((C17499b) this.f38548d.f38552a);
                MessagesListAdapter.this.notifyMessageViewClicked(view, (C17499b) this.f38548d.f38552a);
                return;
            }
            C13116j jVar = this.f38548d;
            boolean z = !jVar.f38553b;
            jVar.f38553b = z;
            if (z) {
                MessagesListAdapter.this.incrementSelectedItemsCount();
            } else {
                MessagesListAdapter.this.decrementSelectedItemsCount();
            }
            MessagesListAdapter messagesListAdapter = MessagesListAdapter.this;
            messagesListAdapter.notifyItemChanged(messagesListAdapter.getMessagePositionById(((C17499b) this.f38548d.f38552a).mo34284a()));
        }
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$b */
    class C13108b implements View.OnLongClickListener {

        /* renamed from: d */
        final /* synthetic */ C13116j f38550d;

        C13108b(C13116j jVar) {
            this.f38550d = jVar;
        }

        public boolean onLongClick(View view) {
            if (MessagesListAdapter.this.selectionListener == null) {
                MessagesListAdapter.this.notifyMessageLongClicked((C17499b) this.f38550d.f38552a);
                MessagesListAdapter.this.notifyMessageViewLongClicked(view, (C17499b) this.f38550d.f38552a);
                return true;
            }
            MessagesListAdapter.isSelectionModeEnabled = true;
            view.performClick();
            return true;
        }
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$c */
    public interface C13109c {
        /* renamed from: a */
        String mo34338a(Object obj);
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$d */
    public interface C13110d {
        void onLoadMore(int i, int i2);
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$e */
    public interface C13111e {
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$f */
    public interface C13112f {
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$g */
    public interface C13113g {
        /* renamed from: a */
        void mo34346a(View view, C17499b bVar);
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$h */
    public interface C13114h {
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$i */
    public interface C13115i {
        /* renamed from: a */
        void mo34344a(int i);
    }

    /* renamed from: ge.bog.chatkit.messages.MessagesListAdapter$j */
    public class C13116j {

        /* renamed from: a */
        public Object f38552a;

        /* renamed from: b */
        public boolean f38553b;

        C13116j(Object obj) {
            this.f38552a = obj;
        }
    }

    public MessagesListAdapter(String str, C17345a aVar) {
        this(str, new MessageHolders(), aVar);
    }

    private void copyToClipboard(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
    }

    /* access modifiers changed from: private */
    public void decrementSelectedItemsCount() {
        boolean z = true;
        int i = this.selectedItemsCount - 1;
        this.selectedItemsCount = i;
        if (i <= 0) {
            z = false;
        }
        isSelectionModeEnabled = z;
        notifySelectionChanged();
    }

    private View.OnClickListener getMessageClickListener(MessagesListAdapter<MESSAGE>.j jVar) {
        return new C13107a(jVar);
    }

    private View.OnLongClickListener getMessageLongClickListener(MessagesListAdapter<MESSAGE>.j jVar) {
        return new C13108b(jVar);
    }

    /* access modifiers changed from: private */
    public int getMessagePositionById(String str) {
        for (int i = 0; i < this.items.size(); i++) {
            Object obj = this.items.get(i).f38552a;
            if ((obj instanceof C17499b) && ((C17499b) obj).mo34284a().contentEquals(str)) {
                return i;
            }
        }
        return -1;
    }

    private String getSelectedText(C13109c cVar, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        ArrayList selectedMessages = getSelectedMessages();
        if (z) {
            Collections.reverse(selectedMessages);
        }
        Iterator it = selectedMessages.iterator();
        while (it.hasNext()) {
            C17499b bVar = (C17499b) it.next();
            if (cVar == null) {
                str = bVar.toString();
            } else {
                str = cVar.mo34338a(bVar);
            }
            sb.append(str);
            sb.append("\n\n");
        }
        sb.replace(sb.length() - 2, sb.length(), "");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public void incrementSelectedItemsCount() {
        this.selectedItemsCount++;
        notifySelectionChanged();
    }

    private boolean isPreviousSameAuthor(String str, int i) {
        int i2 = i + 1;
        if (this.items.size() <= i2) {
            return false;
        }
        if (!(this.items.get(i2).f38552a instanceof C17499b) || !((C17499b) this.items.get(i2).f38552a).mo34287d().mo34234a().contentEquals(str)) {
            return false;
        }
        return true;
    }

    private boolean isPreviousSameDate(int i, Date date) {
        if (this.items.size() > i && (this.items.get(i).f38552a instanceof C17499b)) {
            return C17612a.m61247d(date, ((C17499b) this.items.get(i).f38552a).mo34286c());
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void notifyMessageClicked(MESSAGE message) {
    }

    /* access modifiers changed from: private */
    public void notifyMessageLongClicked(MESSAGE message) {
    }

    /* access modifiers changed from: private */
    public void notifyMessageViewClicked(View view, MESSAGE message) {
        C13113g gVar = this.onMessageViewClickListener;
        if (gVar != null) {
            gVar.mo34346a(view, message);
        }
    }

    /* access modifiers changed from: private */
    public void notifyMessageViewLongClicked(View view, MESSAGE message) {
    }

    private void notifySelectionChanged() {
        C13115i iVar = this.selectionListener;
        if (iVar != null) {
            iVar.mo34344a(this.selectedItemsCount);
        }
    }

    private void recountDateHeaders() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).f38552a instanceof Date) {
                if (i == 0) {
                    arrayList.add(Integer.valueOf(i));
                } else if (this.items.get(i - 1).f38552a instanceof Date) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        Collections.reverse(arrayList);
        for (Integer intValue : arrayList) {
            int intValue2 = intValue.intValue();
            this.items.remove(intValue2);
            notifyItemRemoved(intValue2);
        }
    }

    public void addToEnd(List<MESSAGE> list, boolean z) {
        if (!list.isEmpty()) {
            if (z) {
                Collections.reverse(list);
            }
            if (!this.items.isEmpty()) {
                int size = this.items.size() - 1;
                if (C17612a.m61247d(((C17499b) list.get(0)).mo34286c(), (Date) this.items.get(size).f38552a)) {
                    this.items.remove(size);
                    notifyItemRemoved(size);
                }
            }
            int size2 = this.items.size();
            generateDateHeaders(list);
            notifyItemRangeInserted(size2, this.items.size() - size2);
        }
    }

    public void addToStart(MESSAGE message, boolean z) {
        int i = 1;
        boolean z2 = !isPreviousSameDate(0, message.mo34286c());
        if (z2) {
            this.items.add(0, new C13116j(message.mo34286c()));
        }
        this.items.add(0, new C13116j(message));
        if (z2) {
            i = 2;
        }
        notifyItemRangeInserted(0, i);
        RecyclerView.C1747p pVar = this.layoutManager;
        if (pVar != null && z) {
            pVar.mo5197J1(0);
        }
    }

    public void clear() {
        clear(true);
    }

    public String copySelectedMessagesText(Context context, C13109c cVar, boolean z) {
        String selectedText = getSelectedText(cVar, z);
        copyToClipboard(context, selectedText);
        unselectAllItems();
        return selectedText;
    }

    public void delete(MESSAGE message) {
        deleteById(message.mo34284a());
    }

    public void deleteById(String str) {
        int messagePositionById = getMessagePositionById(str);
        if (messagePositionById >= 0) {
            this.items.remove(messagePositionById);
            notifyItemRemoved(messagePositionById);
            recountDateHeaders();
        }
    }

    public void deleteByIds(String[] strArr) {
        boolean z = false;
        for (String messagePositionById : strArr) {
            int messagePositionById2 = getMessagePositionById(messagePositionById);
            if (messagePositionById2 >= 0) {
                this.items.remove(messagePositionById2);
                notifyItemRemoved(messagePositionById2);
                z = true;
            }
        }
        if (z) {
            recountDateHeaders();
        }
    }

    public void deleteSelectedMessages() {
        delete(getSelectedMessages());
        unselectAllItems();
    }

    public void disableSelectionMode() {
        this.selectionListener = null;
        unselectAllItems();
    }

    public void enableSelectionMode(C13115i iVar) {
        if (iVar != null) {
            this.selectionListener = iVar;
            return;
        }
        throw new IllegalArgumentException("SelectionListener must not be null. Use `disableSelectionMode()` if you want tp disable selection mode");
    }

    /* access modifiers changed from: protected */
    public void generateDateHeaders(List<MESSAGE> list) {
        int i = 0;
        while (i < list.size()) {
            C17499b bVar = (C17499b) list.get(i);
            this.items.add(new C13116j(bVar));
            i++;
            if (list.size() <= i) {
                this.items.add(new C13116j(bVar.mo34286c()));
            } else if (!C17612a.m61247d(bVar.mo34286c(), ((C17499b) list.get(i)).mo34286c())) {
                this.items.add(new C13116j(bVar.mo34286c()));
            }
        }
    }

    public int getItemCount() {
        return this.items.size();
    }

    public int getItemViewType(int i) {
        return this.holders.getViewType(this.items.get(i).f38552a, this.senderId);
    }

    public int getMessagesCount() {
        int i = 0;
        for (C13116j jVar : this.items) {
            if (jVar.f38552a instanceof C17499b) {
                i++;
            }
        }
        return i;
    }

    public ArrayList<MESSAGE> getSelectedMessages() {
        ArrayList<MESSAGE> arrayList = new ArrayList<>();
        for (C13116j next : this.items) {
            Object obj = next.f38552a;
            if ((obj instanceof C17499b) && next.f38553b) {
                arrayList.add((C17499b) obj);
            }
        }
        return arrayList;
    }

    public String getSelectedMessagesText(C13109c cVar, boolean z) {
        String selectedText = getSelectedText(cVar, z);
        unselectAllItems();
        return selectedText;
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public void onLoadMore(int i, int i2) {
        C13110d dVar = this.loadMoreListener;
        if (dVar != null) {
            dVar.onLoadMore(i, i2);
        }
    }

    public void registerViewClickListener(int i, C13113g gVar) {
        this.viewClickListenersArray.append(i, gVar);
    }

    public void setDateHeadersFormatter(C17612a.C17613a aVar) {
        this.dateHeadersFormatter = aVar;
    }

    /* access modifiers changed from: package-private */
    public void setLayoutManager(RecyclerView.C1747p pVar) {
        this.layoutManager = pVar;
    }

    public void setLoadMoreListener(C13110d dVar) {
        this.loadMoreListener = dVar;
    }

    public void setOnMessageClickListener(C13111e eVar) {
    }

    public void setOnMessageLongClickListener(C13112f fVar) {
    }

    public void setOnMessageViewClickListener(C13113g gVar) {
        this.onMessageViewClickListener = gVar;
    }

    public void setOnMessageViewLongClickListener(C13114h hVar) {
    }

    /* access modifiers changed from: package-private */
    public void setStyle(C13117a aVar) {
        this.messagesListStyle = aVar;
    }

    public void unselectAllItems() {
        for (int i = 0; i < this.items.size(); i++) {
            C13116j jVar = this.items.get(i);
            if (jVar.f38553b) {
                jVar.f38553b = false;
                notifyItemChanged(i);
            }
        }
        isSelectionModeEnabled = false;
        this.selectedItemsCount = 0;
        notifySelectionChanged();
    }

    public boolean update(MESSAGE message) {
        return update(message.mo34284a(), message);
    }

    public void updateAndMoveToStart(MESSAGE message) {
        int messagePositionById = getMessagePositionById(message.mo34284a());
        if (messagePositionById >= 0) {
            C13116j jVar = new C13116j(message);
            this.items.remove(messagePositionById);
            this.items.add(0, jVar);
            notifyItemMoved(messagePositionById, 0);
            notifyItemChanged(0);
        }
    }

    public void upsert(MESSAGE message) {
        if (!update(message)) {
            addToStart(message, false);
        }
    }

    public MessagesListAdapter(String str, MessageHolders messageHolders, C17345a aVar) {
        this.viewClickListenersArray = new SparseArray<>();
        this.senderId = str;
        this.holders = messageHolders;
        this.imageLoader = aVar;
        this.items = new ArrayList();
    }

    public void clear(boolean z) {
        List<C13116j> list = this.items;
        if (list != null) {
            list.clear();
            if (z) {
                notifyDataSetChanged();
            }
        }
    }

    public void delete(List<MESSAGE> list) {
        boolean z = false;
        for (MESSAGE a : list) {
            int messagePositionById = getMessagePositionById(a.mo34284a());
            if (messagePositionById >= 0) {
                this.items.remove(messagePositionById);
                notifyItemRemoved(messagePositionById);
                z = true;
            }
        }
        if (z) {
            recountDateHeaders();
        }
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        C13116j jVar = this.items.get(i);
        this.holders.bind(viewHolder, jVar.f38552a, jVar.f38553b, this.imageLoader, getMessageClickListener(jVar), getMessageLongClickListener(jVar), this.dateHeadersFormatter, this.viewClickListenersArray);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.holders.getHolder(viewGroup, i, this.messagesListStyle);
    }

    public boolean update(String str, MESSAGE message) {
        int messagePositionById = getMessagePositionById(str);
        if (messagePositionById < 0) {
            return false;
        }
        this.items.set(messagePositionById, new C13116j(message));
        notifyItemChanged(messagePositionById);
        return true;
    }

    public void upsert(MESSAGE message, boolean z) {
        if (!z) {
            upsert(message);
        } else if (getMessagePositionById(message.mo34284a()) > 0) {
            updateAndMoveToStart(message);
        } else {
            upsert(message);
        }
    }
}
