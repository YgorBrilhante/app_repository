package repositories


import android.os.RemoteException
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import services.GitHubServices

class RepoRepositoryImpl(private val service: GitHubServices): RepoRepository {
    override fun listRepositories(user: String) = flow {
        try{

        }catch (ex: HttpException){
            throw RemoteException(ex.message?: "Não foi possível fazer a busca no momento")
        }
        val repoList = service.listRepositories(user)
        emit(repoList)
    }

}