import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lewisgarton.trademetest.presentation.screens.discover.listingcard.ListingThumbnail
import com.lewisgarton.trademetest.presentation.screens.discover.listingcard.PriceRow
import com.lewisgarton.trademetest.service.models.Listing
import com.lewisgarton.trademetest.ui.theme.Theme

@Composable
fun ListingCard(listing: Listing) {
    Surface() {
        Row(modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()) {

            Row(modifier = Modifier.weight(1F).padding(all = 12.dp)) {
                ListingThumbnail()
            }

            Column(modifier = Modifier.weight(3F)) {
                Text(text = listing.region?: "", style = MaterialTheme.typography.caption)
                Text(text = listing.title?: "", style = MaterialTheme.typography.subtitle1)

                Row(Modifier.padding(top = 24.dp)) {
                    PriceRow()
                }
            }
        }
    }
}

@Composable
@Preview
fun PreviewListingCard() {
    Theme {
        ListingCard(
            listing = Listing(
                region = "Auckland",
                title = "This is some stuff for sale",
                displayPrice = "$500",
                buyNowPrice = null,
                isClassified = true,
                pictureHref = null
            )
        )
    }
}