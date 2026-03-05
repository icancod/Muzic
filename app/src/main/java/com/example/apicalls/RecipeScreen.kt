package com.example.apicalls

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage

@Composable
fun RecipeScreen(
    viewModel: MainViewModel,
    navController: NavController
) {

    val songs = viewModel.songList
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.weight(1f)
        ) {

            items(songs) { song ->

                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable {
                            viewModel.selectSong(song)
                            navController.navigate("detail")
                        }
                ) {

                    Column {

                        AsyncImage(
                            model = song.artworkUrl100,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp)
                        )

                        Text(
                            text = song.trackName,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }

        Button(
            onClick = { viewModel.refresh() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Text("Refresh Songs")
        }
    }
}