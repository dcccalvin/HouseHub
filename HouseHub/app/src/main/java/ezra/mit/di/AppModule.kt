package ezra.mit.di

import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ezra.mit.data.AuthRepository
import ezra.mit.data.AuthRepositoryImpl

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()


    @Provides
    fun provideAuthRepository(impl: AuthRepositoryImpl): AuthRepository = impl
}