package com.salesforce.marketingcloud.sfmcsdk.components.encryption;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Pair;
import androidx.collection.ArraySet;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final int BYTE_BYTES = 1;
    private static final int FLOAT_BYTES = 4;
    private static final int INTEGER_BYTES = 4;
    private static final String KEY_IV = "__iv__";
    private static final int LONG_BYTES = 8;
    private static final String NULL_VALUE = "__NULL__";

    /* renamed from: iv */
    final byte[] f34056iv = generateKeyIv();
    final String mEncryptionKey;
    final String mFileName;
    final List<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new ArrayList();
    final SharedPreferences mSharedPreferences;

    /* renamed from: com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences$1 */
    static /* synthetic */ class C117401 {

        /* renamed from: $SwitchMap$com$salesforce$marketingcloud$sfmcsdk$components$encryption$EncryptedSharedPreferences$EncryptedType */
        static final /* synthetic */ int[] f34057xf2769dc2;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences$EncryptedType[] r0 = com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences.EncryptedType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34057xf2769dc2 = r0
                com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences$EncryptedType r1 = com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences.EncryptedType.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34057xf2769dc2     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences$EncryptedType r1 = com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences.EncryptedType.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34057xf2769dc2     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences$EncryptedType r1 = com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences.EncryptedType.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34057xf2769dc2     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences$EncryptedType r1 = com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences.EncryptedType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34057xf2769dc2     // Catch:{ NoSuchFieldError -> 0x003e }
                com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences$EncryptedType r1 = com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences.EncryptedType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f34057xf2769dc2     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences$EncryptedType r1 = com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences.EncryptedType.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences.C117401.<clinit>():void");
        }
    }

    private static final class Editor implements SharedPreferences.Editor {
        private final AtomicBoolean mClearRequested = new AtomicBoolean(false);
        private final SharedPreferences.Editor mEditor;
        private final EncryptedSharedPreferences mEncryptedSharedPreferences;
        private final List<String> mKeysChanged;

        Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.mEncryptedSharedPreferences = encryptedSharedPreferences;
            this.mEditor = editor;
            this.mKeysChanged = new CopyOnWriteArrayList();
        }

        private void clearKeysIfNeeded() {
            if (this.mClearRequested.getAndSet(false)) {
                for (String next : this.mEncryptedSharedPreferences.getAll().keySet()) {
                    if (!this.mKeysChanged.contains(next) && !this.mEncryptedSharedPreferences.isReservedKey(next)) {
                        this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(next));
                    }
                }
            }
        }

        private void notifyListeners() {
            for (SharedPreferences.OnSharedPreferenceChangeListener next : this.mEncryptedSharedPreferences.mListeners) {
                for (String onSharedPreferenceChanged : this.mKeysChanged) {
                    next.onSharedPreferenceChanged(this.mEncryptedSharedPreferences, onSharedPreferenceChanged);
                }
            }
        }

        private void putEncryptedObject(String str, byte[] bArr) {
            if (!this.mEncryptedSharedPreferences.isReservedKey(str)) {
                this.mKeysChanged.add(str);
                if (str == null) {
                    str = EncryptedSharedPreferences.NULL_VALUE;
                }
                Pair access$100 = this.mEncryptedSharedPreferences.encryptKeyValuePair(str, bArr);
                this.mEditor.putString((String) access$100.first, (String) access$100.second);
                return;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }

        public void apply() {
            clearKeysIfNeeded();
            this.mEditor.apply();
            notifyListeners();
            this.mKeysChanged.clear();
        }

        public SharedPreferences.Editor clear() {
            this.mClearRequested.set(true);
            return this;
        }

        public boolean commit() {
            clearKeysIfNeeded();
            try {
                return this.mEditor.commit();
            } finally {
                notifyListeners();
                this.mKeysChanged.clear();
            }
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EncryptedType.BOOLEAN.getId());
            allocate.put(z ? (byte) 1 : 0);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.FLOAT.getId());
            allocate.putFloat(f);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.INT.getId());
            allocate.putInt(i);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EncryptedType.LONG.getId());
            allocate.putLong(j);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EncryptedType.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new ArraySet<>();
                set.add(EncryptedSharedPreferences.NULL_VALUE);
            }
            ArrayList<byte[]> arrayList = new ArrayList<>(set.size());
            int size = set.size() * 4;
            for (String bytes : set) {
                byte[] bytes2 = bytes.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes2);
                size += bytes2.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EncryptedType.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            putEncryptedObject(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            if (!this.mEncryptedSharedPreferences.isReservedKey(str)) {
                this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                this.mKeysChanged.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    private enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        private EncryptedType(int i) {
            this.mId = i;
        }

        public static EncryptedType fromId(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    private EncryptedSharedPreferences(String str, SharedPreferences sharedPreferences, String str2) {
        this.mFileName = str;
        this.mSharedPreferences = sharedPreferences;
        this.mEncryptionKey = str2;
    }

    public static SharedPreferences create(Context context, String str, String str2) {
        return new EncryptedSharedPreferences(str, context.getApplicationContext().getSharedPreferences(str, 0), str2);
    }

    private String decryptKey(String str) {
        String decrypt = Encryptor.decrypt(str, this.mEncryptionKey);
        if (decrypt.equals(NULL_VALUE)) {
            return null;
        }
        return decrypt;
    }

    private byte[] decryptValue(String str) {
        return Base64.decode(Encryptor.decrypt(str, this.mEncryptionKey), 2);
    }

    /* access modifiers changed from: private */
    public String encryptKey(String str) {
        if (str == null) {
            str = NULL_VALUE;
        }
        return Encryptor.encrypt(str, this.mEncryptionKey, this.f34056iv);
    }

    /* access modifiers changed from: private */
    public Pair<String, String> encryptKeyValuePair(String str, byte[] bArr) {
        return new Pair<>(encryptKey(str), encryptValue(bArr));
    }

    private String encryptValue(byte[] bArr) {
        return Encryptor.encrypt(Base64.encodeToString(bArr, 2), this.mEncryptionKey);
    }

    private byte[] generateKeyIv() {
        String string = this.mSharedPreferences.getString(KEY_IV, (String) null);
        if (string != null) {
            return Base64.decode(string, 2);
        }
        byte[] generateInitVector = Encryptor.generateInitVector();
        this.mSharedPreferences.edit().putString(KEY_IV, Base64.encodeToString(generateInitVector, 2)).apply();
        return generateInitVector;
    }

    private Object getDecryptedObject(String str) {
        if (!isReservedKey(str)) {
            if (str == null) {
                str = NULL_VALUE;
            }
            String string = this.mSharedPreferences.getString(encryptKey(str), (String) null);
            if (string == null) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(decryptValue(string));
            boolean z = false;
            wrap.position(0);
            switch (C117401.f34057xf2769dc2[EncryptedType.fromId(wrap.getInt()).ordinal()]) {
                case 1:
                    int i = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i);
                    String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                    if (charBuffer.equals(NULL_VALUE)) {
                        return null;
                    }
                    return charBuffer;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case 5:
                    if (wrap.get() != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                case 6:
                    ArraySet arraySet = new ArraySet();
                    while (wrap.hasRemaining()) {
                        int i2 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i2);
                        wrap.position(wrap.position() + i2);
                        arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (arraySet.size() != 1 || !NULL_VALUE.equals(arraySet.valueAt(0))) {
                        return arraySet;
                    }
                    return null;
                default:
                    return null;
            }
        } else {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    public boolean contains(String str) {
        if (!isReservedKey(str)) {
            return this.mSharedPreferences.contains(encryptKey(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    public SharedPreferences.Editor edit() {
        return new Editor(this, this.mSharedPreferences.edit());
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey((String) next.getKey())) {
                String decryptKey = decryptKey((String) next.getKey());
                hashMap.put(decryptKey, getDecryptedObject(decryptKey));
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject == null || !(decryptedObject instanceof Boolean)) {
            return z;
        }
        return ((Boolean) decryptedObject).booleanValue();
    }

    public float getFloat(String str, float f) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject == null || !(decryptedObject instanceof Float)) {
            return f;
        }
        return ((Float) decryptedObject).floatValue();
    }

    public int getInt(String str, int i) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject == null || !(decryptedObject instanceof Integer)) {
            return i;
        }
        return ((Integer) decryptedObject).intValue();
    }

    public long getLong(String str, long j) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject == null || !(decryptedObject instanceof Long)) {
            return j;
        }
        return ((Long) decryptedObject).longValue();
    }

    public String getString(String str, String str2) {
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject == null || !(decryptedObject instanceof String)) {
            return str2;
        }
        return (String) decryptedObject;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject instanceof Set) {
            set2 = (Set) decryptedObject;
        } else {
            set2 = new ArraySet<>();
        }
        if (set2.size() > 0) {
            return set2;
        }
        return set;
    }

    /* access modifiers changed from: package-private */
    public boolean isReservedKey(String str) {
        return KEY_IV.equals(str);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.add(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }
}
