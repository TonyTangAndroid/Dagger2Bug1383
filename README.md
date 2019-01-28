# Dagger2Bug1383
A repository to demonstrate the Android Gradle plugin 3.2.1 that caused problems with `AndroidX` and Dagger 2.20

All combination works fine except Android Gradle Plugin 3.2.1 with Dagger 2.20 or later.


| Combination                  | Dagger 2.19 | Dagger 2.20+ |
|------------------------------|-------------|--------------|
| Android Gradle Plugin 3.2.1  | OK          | `NOT OK`       |
| Android Gradle Plugin 3.3.0+ | OK          | OK           |
