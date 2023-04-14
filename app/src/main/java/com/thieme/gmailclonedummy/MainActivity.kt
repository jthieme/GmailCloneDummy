package com.thieme.gmailclonedummy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.thieme.gmailclonedummy.components.DrawerMenu
import com.thieme.gmailclonedummy.components.HomeAppBar
import com.thieme.gmailclonedummy.components.HomeBottomMenu
import com.thieme.gmailclonedummy.ui.theme.GmailCloneDummyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCloneDummyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { HomeAppBar(scaffoldState, coroutineScope) },
        drawerContent = {
            DrawerMenu(scrollState)
        },
        bottomBar = {
            HomeBottomMenu()
        }
        ) {
        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailCloneDummyTheme {
        GmailApp()
    }
}