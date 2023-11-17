package com.salesforce.marketingcloud.sfmcsdk.components.encryption;

import android.content.Context;
import kotlin.jvm.internal.C41536l;

public final class EncryptionManager {
    private final String encryptionKey;

    public EncryptionManager(Context context, String str) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "moduleApplicationId");
        String encryptionKey2 = new SalesforceKeyGenerator(context, new KeyStoreWrapper(context)).getEncryptionKey(str);
        C41536l.m120488h(encryptionKey2, "salesforceKeyGenerator.g…nKey(moduleApplicationId)");
        this.encryptionKey = encryptionKey2;
    }

    public final String decrypt(String str) {
        C41536l.m120489i(str, "data");
        return Encryptor.decrypt(str, this.encryptionKey);
    }

    public final String encrypt(String str) {
        C41536l.m120489i(str, "data");
        return Encryptor.encrypt(str, this.encryptionKey);
    }

    public final byte[] generateIV() {
        byte[] generateInitVector = Encryptor.generateInitVector();
        C41536l.m120488h(generateInitVector, "generateInitVector()");
        return generateInitVector;
    }

    public final String getEncryptionKey$sfmcsdk_release() {
        return this.encryptionKey;
    }

    public final String encrypt(String str, byte[] bArr) {
        C41536l.m120489i(str, "data");
        C41536l.m120489i(bArr, "iv");
        return Encryptor.encrypt(str, this.encryptionKey, bArr);
    }
}
