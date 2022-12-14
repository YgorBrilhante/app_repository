package br.com.dio.app.repositories.domain

import br.com.dio.app.repositories.core.UseCase
import kotlinx.coroutines.flow.Flow
import model.Repo
import repositories.RepoRepository

class ListUserRepositoriesUseCase(private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}