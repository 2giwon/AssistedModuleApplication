package com.egiwon.assistedmoduleapplication.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.egiwon.assistedmoduleapplication.R
import com.egiwon.assistedmoduleapplication.databinding.ActivityDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    @Inject
    lateinit var detailViewModelFactory: DetailViewModel.AssistedFactory

    private val viewModel: DetailViewModel by viewModels {
        DetailViewModel.provideFactory(
            detailViewModelFactory,
            intent.getStringExtra(EXTRA_MESSAGE) ?: ""
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        binding.lifecycleOwner = this

        viewModel.showMessage()
        setObserve()
    }

    private fun setObserve() {
        viewModel.messageEvent.observe(this, (binding.tvMessage::setText))
    }

    companion object {
        const val EXTRA_MESSAGE = "extra_message"
    }
}
