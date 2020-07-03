%module "test"

%include "arrays_java.i";
%include "stdint.i";
%include "typemaps.i"

#if defined(SWIGJAVA)
#if defined(SWIGWORDSIZE64)
%define PRIMITIVE_TYPEMAP(NEW_TYPE, TYPE)
%clear NEW_TYPE;
%clear NEW_TYPE *;
%clear NEW_TYPE &;
%clear const NEW_TYPE &;
%apply TYPE { NEW_TYPE };
%apply TYPE * { NEW_TYPE * };
%apply TYPE & { NEW_TYPE & };
%apply const TYPE & { const NEW_TYPE & };
%enddef // PRIMITIVE_TYPEMAP
PRIMITIVE_TYPEMAP(long long, long int);
PRIMITIVE_TYPEMAP(long long, unsigned long int);
PRIMITIVE_TYPEMAP(long long, long);
PRIMITIVE_TYPEMAP(long long, unsigned long);
#undef PRIMITIVE_TYPEMAP
#endif // defined(SWIGWORDSIZE64)
#endif // defined(SWIGJAVA)


%include "test.h";
