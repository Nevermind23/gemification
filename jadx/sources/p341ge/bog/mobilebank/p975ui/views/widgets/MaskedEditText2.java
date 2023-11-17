package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.C0454j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.MaskedEditText2 */
public class MaskedEditText2 extends C0454j implements TextWatcher {
    private AfterTextMaskedListener afterTextMaskedListener;
    /* access modifiers changed from: private */
    public String allowedCharacters = null;
    private String cleanMask;
    private ClipboardManager clipBoardService;
    private ClipboardPasteTextListener clipboardPasteTextListener;
    /* access modifiers changed from: private */
    public String deleteChar;
    private String filteredMask;
    /* access modifiers changed from: private */
    public Integer firstAllowedPosition = 0;
    private String format;
    private boolean ignoreSelection;
    /* access modifiers changed from: private */
    public Integer lastAllowedPosition = 0;
    /* access modifiers changed from: private */
    public ArrayList<Integer> listValidCursorPositions = new ArrayList<>();
    /* access modifiers changed from: private */
    public String mask;
    private C35746b maskedInputFilter;
    /* access modifiers changed from: private */
    public String notMaskedSymbol;
    /* access modifiers changed from: private */
    public View.OnFocusChangeListener onFocusChangeListener;
    private String replacementChar;
    private boolean required;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MaskedEditText2$AfterTextMaskedListener */
    public interface AfterTextMaskedListener {
        void afterTextMasked();
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MaskedEditText2$ClipboardPasteTextListener */
    public interface ClipboardPasteTextListener {
        boolean onManageClipboardText(String str);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MaskedEditText2$a */
    class C35745a implements View.OnFocusChangeListener {
        C35745a() {
        }

        public void onFocusChange(View view, boolean z) {
            if (MaskedEditText2.this.onFocusChangeListener != null) {
                MaskedEditText2.this.onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.MaskedEditText2$b */
    private class C35746b implements InputFilter {

        /* renamed from: a */
        private boolean f86378a;

        /* renamed from: b */
        private boolean f86379b;

        /* renamed from: a */
        private int m106093a(int i, boolean z) {
            if (z) {
                ListIterator listIterator = MaskedEditText2.this.listValidCursorPositions.listIterator(MaskedEditText2.this.listValidCursorPositions.size() - 1);
                while (listIterator.hasPrevious()) {
                    Integer num = (Integer) listIterator.previous();
                    if (num.intValue() <= i) {
                        return num.intValue() + 1;
                    }
                }
                return MaskedEditText2.this.firstAllowedPosition.intValue();
            } else if (i <= MaskedEditText2.this.firstAllowedPosition.intValue()) {
                return MaskedEditText2.this.firstAllowedPosition.intValue();
            } else {
                ListIterator listIterator2 = MaskedEditText2.this.listValidCursorPositions.listIterator();
                while (listIterator2.hasNext()) {
                    Integer num2 = (Integer) listIterator2.next();
                    if (num2.intValue() >= i) {
                        return num2.intValue() - 1;
                    }
                }
                return MaskedEditText2.this.lastAllowedPosition.intValue();
            }
        }

        /* renamed from: b */
        private int m106094b(int i, boolean z) {
            if (!MaskedEditText2.this.listValidCursorPositions.contains(Integer.valueOf(i))) {
                return m106093a(i, z);
            }
            ListIterator listIterator = MaskedEditText2.this.listValidCursorPositions.listIterator(MaskedEditText2.this.listValidCursorPositions.indexOf(Integer.valueOf(i)));
            if (z) {
                if (listIterator.hasPrevious()) {
                    return ((Integer) listIterator.previous()).intValue() + 1;
                }
                return i;
            } else if (listIterator.hasNext()) {
                return ((Integer) listIterator.next()).intValue();
            } else {
                return i;
            }
        }

        /* renamed from: c */
        private boolean m106095c(int i) {
            return i < MaskedEditText2.this.mask.length() && MaskedEditText2.this.mask.charAt(i) == MaskedEditText2.this.notMaskedSymbol.toCharArray()[0];
        }

        /* renamed from: e */
        private int m106096e(int i) {
            int b = m106094b(i, false);
            if (b > MaskedEditText2.this.lastAllowedPosition.intValue()) {
                b = MaskedEditText2.this.lastAllowedPosition.intValue();
            }
            MaskedEditText2.this.setSelection(b);
            return b;
        }

        /* renamed from: f */
        private void m106097f(int i) {
            MaskedEditText2.this.setSelection(m106094b(i, true));
        }

        /* renamed from: d */
        public void mo87310d(boolean z) {
            this.f86379b = z;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            int i5;
            try {
                if (this.f86379b) {
                    return null;
                }
                if (charSequence.length() == 1 && i3 == 0) {
                    if (i4 == spanned.length()) {
                        if (m106095c(i3)) {
                            return null;
                        }
                        return "";
                    }
                }
                if (!(charSequence instanceof SpannableStringBuilder)) {
                    StringBuilder sb = new StringBuilder();
                    int i6 = i4 - i3;
                    boolean[] zArr = new boolean[(i6 + 1)];
                    for (int i7 = 0; i7 <= i6; i7++) {
                        zArr[i7] = m106095c(i3 + i7);
                    }
                    while (i < i2) {
                        char charAt = charSequence.charAt(i);
                        if (MaskedEditText2.this.allowedCharacters != null) {
                            if (!MaskedEditText2.this.allowedCharacters.contains(charAt + "")) {
                                i++;
                            }
                        }
                        if (zArr[0]) {
                            this.f86378a = false;
                            int i8 = i3 + 1;
                            MaskedEditText2.this.getText().replace(i3, i8, "");
                            this.f86378a = true;
                            sb.append(charAt);
                            if (m106095c(i8)) {
                                i8 = i3;
                            }
                            m106096e(i8);
                        } else if (i3 != MaskedEditText2.this.mask.length()) {
                            if (!m106095c(i3)) {
                                i5 = i3 + 1;
                            } else {
                                i5 = i3;
                            }
                            int e = m106096e(i5);
                            MaskedEditText2.this.getText().replace(e, e, Character.toString(charAt));
                        }
                        i++;
                    }
                    if (this.f86378a && TextUtils.isEmpty(charSequence) && i4 != 0) {
                        for (int i9 = 0; i9 < i6; i9++) {
                            if (zArr[i9]) {
                                sb.append(MaskedEditText2.this.deleteChar);
                            } else {
                                sb.append(MaskedEditText2.this.mask.charAt(i3 + i9));
                            }
                        }
                        m106097f(i3);
                    }
                    return sb.toString();
                }
                return null;
            } catch (Exception unused) {
            }
        }

        private C35746b() {
            this.f86378a = true;
            this.f86379b = false;
        }
    }

    public MaskedEditText2(Context context) {
        super(context);
    }

    private String formatText(String str, String str2) {
        Matcher matcher = Pattern.compile("(\\[[\\d]+\\])").matcher(str2);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, getSymbol(str, matcher.group()));
        }
        return stringBuffer.toString();
    }

    private int getLastValidPosition(int i) {
        String obj = getText().toString();
        if (i <= 0) {
            return 0;
        }
        while (i > 0) {
            if (i < obj.length() && this.cleanMask.contains(String.valueOf(obj.charAt(i))) && !String.valueOf(obj.charAt(i - 1)).equals(this.replacementChar)) {
                return i + 1;
            }
            int i2 = i - 1;
            if (!String.valueOf(obj.charAt(i2)).equals(this.replacementChar) && this.listValidCursorPositions.contains(Integer.valueOf(i2))) {
                return i;
            }
            i--;
        }
        return 0;
    }

    private String getSymbol(String str, String str2) {
        return String.valueOf(str.toCharArray()[Integer.valueOf(str2.replace("[", "").replace("]", "")).intValue() - 1]);
    }

    private String getSymbolExceptions() {
        if (TextUtils.isEmpty(this.filteredMask)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (char c : this.filteredMask.toCharArray()) {
            if (!Character.isDigit(c) && sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        sb.append(this.replacementChar);
        return sb.toString();
    }

    private void init() {
        if (isMaskedInput()) {
            if (this.deleteChar == null) {
                this.deleteChar = " ";
            }
            if (this.replacementChar == null) {
                this.replacementChar = " ";
            }
            if (this.format == null) {
                this.format = "";
            }
            initListValidCursorPositions(this.mask, this.notMaskedSymbol);
            this.filteredMask = this.mask.replace(this.notMaskedSymbol, this.replacementChar);
            this.cleanMask = this.mask.replace(this.notMaskedSymbol, "");
            setInputType(getInputType());
            setText(this.filteredMask, TextView.BufferType.NORMAL);
            C35746b bVar = new C35746b();
            this.maskedInputFilter = bVar;
            setFilters(new InputFilter[]{bVar});
        }
    }

    private void initListValidCursorPositions(String str, String str2) {
        char[] charArray = str.toCharArray();
        char charAt = str2.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == charAt) {
                this.listValidCursorPositions.add(Integer.valueOf(i));
            }
        }
        if (this.listValidCursorPositions.size() > 0) {
            this.firstAllowedPosition = this.listValidCursorPositions.get(0);
            ArrayList<Integer> arrayList = this.listValidCursorPositions;
            this.lastAllowedPosition = arrayList.get(arrayList.size() - 1);
        }
    }

    private boolean isMaskedInput() {
        return !TextUtils.isEmpty(this.mask) && !TextUtils.isEmpty(this.notMaskedSymbol);
    }

    public void afterTextChanged(Editable editable) {
        AfterTextMaskedListener afterTextMaskedListener2 = this.afterTextMaskedListener;
        if (afterTextMaskedListener2 != null) {
            afterTextMaskedListener2.afterTextMasked();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public String getUnmaskedText() {
        Editable text = super.getText();
        String str = this.mask;
        if (str == null || str.isEmpty()) {
            return text.toString().trim();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator<Integer> it = this.listValidCursorPositions.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (text != null) {
                spannableStringBuilder.append(text.charAt(next.intValue()));
            }
        }
        String str2 = this.format;
        if (str2 == null || str2.isEmpty()) {
            return spannableStringBuilder.toString().trim();
        }
        return formatText(spannableStringBuilder.toString(), this.format);
    }

    public void initMask(String str, String str2) {
        this.mask = str;
        this.notMaskedSymbol = str2;
        addTextChangedListener(this);
        init();
        setLongClickable(false);
        setSingleLine(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public boolean isRequired() {
        return this.required;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        int i3 = 0;
        if (this.mask == null || this.ignoreSelection) {
            this.ignoreSelection = false;
            super.onSelectionChanged(i, i2);
            return;
        }
        String obj = getText().toString();
        if (i == i2) {
            if (!obj.equals(this.filteredMask)) {
                i3 = getLastValidPosition(i);
            }
            i = i3;
            setSelection(i, i3);
        } else {
            i3 = getLastValidPosition(i2);
            setSelection(i, i3);
        }
        super.onSelectionChanged(i, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (this.clipboardPasteTextListener == null || !(i == 16908322 || i == 16908337)) {
            try {
                return super.onTextContextMenuItem(i);
            } catch (ArrayIndexOutOfBoundsException unused) {
                setText("");
                return false;
            }
        } else {
            if (this.clipBoardService == null) {
                this.clipBoardService = (ClipboardManager) getContext().getSystemService("clipboard");
            }
            ClipboardManager clipboardManager = this.clipBoardService;
            if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() == 0) {
                return false;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getText() != null) {
                return this.clipboardPasteTextListener.onManageClipboardText(itemAt.getText().toString());
            }
            return false;
        }
    }

    public void setAfterTextMaskedListener(AfterTextMaskedListener afterTextMaskedListener2) {
        this.afterTextMaskedListener = afterTextMaskedListener2;
    }

    public void setClipboardPasteTextListener(ClipboardPasteTextListener clipboardPasteTextListener2) {
        this.clipboardPasteTextListener = clipboardPasteTextListener2;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setInputType(int i) {
        if (isMaskedInput()) {
            int i2 = i & 15;
            if (i2 == 1) {
                super.setInputType(i | 144 | 524288);
            } else if (i2 == 2 || i2 == 3) {
                String str = "0123456789." + getSymbolExceptions();
                this.allowedCharacters = str;
                setKeyListener(DigitsKeyListener.getInstance(str));
            }
        } else {
            super.setInputType(i);
        }
    }

    public void setMaskedText(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder(str);
            if (sb.length() < this.listValidCursorPositions.size()) {
                while (sb.length() < this.listValidCursorPositions.size()) {
                    sb.append(this.deleteChar);
                }
            } else if (sb.length() > this.listValidCursorPositions.size()) {
                sb.replace(this.listValidCursorPositions.size(), sb.length(), "");
            }
            StringBuilder sb2 = new StringBuilder(sb);
            if (getText() != null) {
                for (int i = 0; i < this.mask.length(); i++) {
                    if (!this.listValidCursorPositions.contains(Integer.valueOf(i))) {
                        sb2.insert(i, String.valueOf(this.mask.charAt(i)));
                    }
                }
                this.maskedInputFilter.mo87310d(true);
                setText(sb2.toString());
                this.maskedInputFilter.mo87310d(false);
            }
        }
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener2) {
        this.onFocusChangeListener = onFocusChangeListener2;
        super.setOnFocusChangeListener(new C35745a());
    }

    public void setRequired(boolean z) {
        this.required = z;
    }

    public void setSelection(int i) {
        this.ignoreSelection = true;
        if (i > getText().length()) {
            i = getText().length();
        }
        super.setSelection(i);
    }

    public MaskedEditText2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaskedEditText2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
