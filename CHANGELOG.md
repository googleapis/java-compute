# Changelog

## [0.119.0](https://www.github.com/googleapis/java-compute/compare/v0.118.0...v0.119.0) (2021-07-07)


### ⚠ BREAKING CHANGES

* regenerate competu.proto with uint64/int64 field types where appropriate (instead of string) (#477)
* Migrate to gapic-generator-java, remove monolith dependency (#476)
* Java Compute DIREGAPIC initial commit
* add Accelerators, GRPCHealthCheck, PreservedState, StatefulPolicy (#180)

### Features

* add Accelerators, GRPCHealthCheck, PreservedState, StatefulPolicy ([#180](https://www.github.com/googleapis/java-compute/issues/180)) ([97fd6f6](https://www.github.com/googleapis/java-compute/commit/97fd6f60b68fd2bb6d6c00d180b80955e7621bf8))
* add new APIs including Bulk API ([#430](https://www.github.com/googleapis/java-compute/issues/430)) ([3b9064f](https://www.github.com/googleapis/java-compute/commit/3b9064f4eea9a2d8e153dc2a9dc7e477c341fef4))
* add new APIs including Bulk API ([#430](https://www.github.com/googleapis/java-compute/issues/430)) ([92e6d0a](https://www.github.com/googleapis/java-compute/commit/92e6d0a02228bc8b059ae637b702e7801ab0ad18))
* **deps:** adopt flatten plugin and google-cloud-shared-dependencies ([#161](https://www.github.com/googleapis/java-compute/issues/161)) ([79e9b58](https://www.github.com/googleapis/java-compute/commit/79e9b582f79164c2b519cecfdaed1165b18b70e8))
* Java Compute DIREGAPIC initial commit ([d78c9ae](https://www.github.com/googleapis/java-compute/commit/d78c9aec86afa502e171ee7a339ce3c19df61c6c))
* Regenerate latest version of the client with field presence support ([#401](https://www.github.com/googleapis/java-compute/issues/401)) ([9d0d0fa](https://www.github.com/googleapis/java-compute/commit/9d0d0fa61f15832197d8b5520bdef51530873736))
* Regenerate latest version of the client with field presence support ([#401](https://www.github.com/googleapis/java-compute/issues/401)) ([6e46502](https://www.github.com/googleapis/java-compute/commit/6e46502f12416fe6f1de859898f40b3a6edcd57c))
* Regenerate the newest Compute client ([#282](https://www.github.com/googleapis/java-compute/issues/282)) ([3fbd88e](https://www.github.com/googleapis/java-compute/commit/3fbd88e1466be9f0f8f8f1cb1eb9cc6f88e99a74))


### Bug Fixes

* Add shopt -s nullglob to dependencies script ([#478](https://www.github.com/googleapis/java-compute/issues/478)) ([f6a3200](https://www.github.com/googleapis/java-compute/commit/f6a32008be1613dc10e7202c185d1ea45e147c1d))
* disable 8001 clirr error (backward compabitility check) ([#285](https://www.github.com/googleapis/java-compute/issues/285)) ([90ba363](https://www.github.com/googleapis/java-compute/commit/90ba363e90def56a78decda4ef567c0c71c6e5d7))
* fix fields serialization for cases when the field name start with a capital letter ([#417](https://www.github.com/googleapis/java-compute/issues/417)) ([cefc249](https://www.github.com/googleapis/java-compute/commit/cefc249e26c684e4762cd97ea8acf7f953953f43))
* fix fields serialization for cases when the field name start with a capital letter ([#417](https://www.github.com/googleapis/java-compute/issues/417)) ([0d6a624](https://www.github.com/googleapis/java-compute/commit/0d6a624bcec4a269922766e092b0dd8af1be948e))
* regenerate competu.proto with uint64/int64 field types where appropriate (instead of string) ([#477](https://www.github.com/googleapis/java-compute/issues/477)) ([130782d](https://www.github.com/googleapis/java-compute/commit/130782d38e86af697cd6f1578dcdc846de5dcfb5))
* Update dependencies.sh to not break on mac ([#466](https://www.github.com/googleapis/java-compute/issues/466)) ([ed797d3](https://www.github.com/googleapis/java-compute/commit/ed797d3ba8635afb75020faefd71899aeeaba2d1))


### Documentation

* update libraries-bom ([#190](https://www.github.com/googleapis/java-compute/issues/190)) ([9512e88](https://www.github.com/googleapis/java-compute/commit/9512e88234a45bc184e2ef6274e00c3816cd0535))


### Dependencies

* update core dependencies to v1.93.5 ([#152](https://www.github.com/googleapis/java-compute/issues/152)) ([7ad4d75](https://www.github.com/googleapis/java-compute/commit/7ad4d753a98047282ba52e6f6c0f6a9ec24b9f30))
* update core transport dependencies ([#170](https://www.github.com/googleapis/java-compute/issues/170)) ([3f02de4](https://www.github.com/googleapis/java-compute/commit/3f02de4a0ea495fb7a6e3c269774e540e6f9667e))
* update dependency com.google.apis:google-api-services-compute to v1-rev20200331-1.30.9 ([#139](https://www.github.com/googleapis/java-compute/issues/139)) ([ef44308](https://www.github.com/googleapis/java-compute/commit/ef443088f3790e8ea8f56f7512127bf4307b9748))
* update dependency com.google.apis:google-api-services-compute to v1-rev20200727-1.30.10 ([#148](https://www.github.com/googleapis/java-compute/issues/148)) ([2c93898](https://www.github.com/googleapis/java-compute/commit/2c93898ea52604c714999b24fa74cc43fd58a112))
* update dependency com.google.apis:google-api-services-compute to v1-rev20200811-1.30.10 ([#193](https://www.github.com/googleapis/java-compute/issues/193)) ([a010ca4](https://www.github.com/googleapis/java-compute/commit/a010ca41e280448bdc0e6431489a6aeee3b29cd4))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.0 ([#213](https://www.github.com/googleapis/java-compute/issues/213)) ([43951a9](https://www.github.com/googleapis/java-compute/commit/43951a9d0547c61930a5bdc983f319e5e7951d01))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.1 ([#224](https://www.github.com/googleapis/java-compute/issues/224)) ([2ab4b11](https://www.github.com/googleapis/java-compute/commit/2ab4b112f9d4da84cd34058e69c2a7dd9646c148))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.10.2 ([#226](https://www.github.com/googleapis/java-compute/issues/226)) ([a1ce801](https://www.github.com/googleapis/java-compute/commit/a1ce801fe6b2dcda86355caf79467023b430cea8))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.8.6 ([#183](https://www.github.com/googleapis/java-compute/issues/183)) ([87b6faf](https://www.github.com/googleapis/java-compute/commit/87b6faf92be991365c190cb3067ecb184bf0c0a1))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v0.9.0 ([#197](https://www.github.com/googleapis/java-compute/issues/197)) ([8145520](https://www.github.com/googleapis/java-compute/commit/81455209a42016a2d09f67d4b7c09157db11d828))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.3.0 ([#455](https://www.github.com/googleapis/java-compute/issues/455)) ([2a9b955](https://www.github.com/googleapis/java-compute/commit/2a9b9558150be14e3caab7559656074f044cc9b4))
* update dependency com.google.cloud:google-cloud-shared-dependencies to v1.4.0 ([#475](https://www.github.com/googleapis/java-compute/issues/475)) ([0a7f7d1](https://www.github.com/googleapis/java-compute/commit/0a7f7d1044972ca5b922bb43f79b70766583f50d))
* update dependency com.google.guava:guava-bom to v29 ([#119](https://www.github.com/googleapis/java-compute/issues/119)) ([20a7432](https://www.github.com/googleapis/java-compute/commit/20a7432b25c93f6d027eb5bb20baedc6cb3e6a0b))
* update dependency com.google.guava:guava-bom to v29 ([#119](https://www.github.com/googleapis/java-compute/issues/119)) ([e5b9170](https://www.github.com/googleapis/java-compute/commit/e5b9170ad3d746a9cd724b0a7e3f69b8ebde6c67))
* update dependency com.google.http-client:google-http-client-bom to v1.35.0 ([#134](https://www.github.com/googleapis/java-compute/issues/134)) ([a3fc066](https://www.github.com/googleapis/java-compute/commit/a3fc0668aedef440e1931ef568d8237e3903bd74))
* update dependency com.google.oauth-client:google-oauth-client-bom to v1.31.0 ([#184](https://www.github.com/googleapis/java-compute/issues/184)) ([37e5dc9](https://www.github.com/googleapis/java-compute/commit/37e5dc99619062164b35dd71986be083990a2e93))
* update dependency org.threeten:threetenbp to v1.4.4 ([#130](https://www.github.com/googleapis/java-compute/issues/130)) ([6bdca9d](https://www.github.com/googleapis/java-compute/commit/6bdca9d50bed44e0ec985b9556372f1675f09bea))


### Miscellaneous Chores

* Migrate to gapic-generator-java, remove monolith dependency ([#476](https://www.github.com/googleapis/java-compute/issues/476)) ([11506ab](https://www.github.com/googleapis/java-compute/commit/11506ab2cc2a7bdf541baf79671aa7a0ce61a95d))
