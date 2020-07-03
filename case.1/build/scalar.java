/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class scalar {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected scalar(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(scalar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        testJNI.delete_scalar(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setArr(SWIGTYPE_p_uint64_t value) {
    testJNI.scalar_arr_set(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint64_t getArr() {
    long cPtr = testJNI.scalar_arr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint64_t(cPtr, false);
  }

  public scalar() {
    this(testJNI.new_scalar(), true);
  }

}
