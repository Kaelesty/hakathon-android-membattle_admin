package com.kaelesty.membattleadmin.domain.usecases

import com.kaelesty.membattleadmin.domain.repos.IBattlesRepo
import javax.inject.Inject

class StartBattleUseCase @Inject constructor(private val repo: IBattlesRepo) {

	suspend operator fun invoke() = repo.startBattle()
}