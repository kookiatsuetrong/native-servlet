#include <jni.h>

JNIEXPORT jdouble JNICALL
Java_Common_getTotal(JNIEnv *env, jobject o, jdouble x) {
	return x * x;
}