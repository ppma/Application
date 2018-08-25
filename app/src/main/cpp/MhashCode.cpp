#include <jni.h>
#include <string>
using namespace std;

extern "C" {

#include "ChashCode.h"


JNIEXPORT jstring JNICALL Java_com_ppma_application_MainActivity_getRandomString(
        JNIEnv *env,
        jobject obj,
        jint length) {
    return Java_com_android_settings_AdbSetting_getRandomString(env, obj, length);
}


JNIEXPORT jint JNICALL Java_com_ppma_application_MainActivity_getHashcode(
        JNIEnv *env,
        jobject obj,
        jstring rand,
        jstring mac) {
    return Java_com_android_settings_AdbSetting_getHashcode(env, obj, rand, mac);
}
}

